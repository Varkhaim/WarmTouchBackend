package com.mf.warmtouch.model;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "news")
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

    public void updateFrom(final News source)
    {
        title = source.title;
        content = source.content;
        postDate = source.postDate;
    }
}
