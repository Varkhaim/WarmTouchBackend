package com.mf.warmtouch.model.entities;

import com.mf.warmtouch.model.enums.NewsType;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Data
@Entity
@Table(name = "news")
@SQLDelete(sql = "UPDATE news SET deleted=true WHERE id=?")
@Where(clause = "deleted = false")
public class News
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "post_date")
    private LocalDateTime postDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private NewsType type;
    @Column(name = "deleted")
    @ColumnDefault("false")
    private Boolean deleted;

    public void updateFrom(final News source)
    {
        title = source.title;
        content = source.content;
        postDate = source.postDate;
        type = source.type;
    }

    public String getPostDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String date = postDate.format(formatter);
        return date;
    }

}
