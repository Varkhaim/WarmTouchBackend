package com.mf.warmtouch.model.entities;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
@Data
@Entity
@Table(name = "aboutme")
@SQLDelete(sql = "UPDATE user SET deleted=true WHERE id=?")
@Where(clause = "deleted = false")
public class AboutMeBlock
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "content")
    private String content;
    @Column(name = "deleted")
    @ColumnDefault("false")
    private Boolean deleted;

    public void updateFrom(final AboutMeBlock source)
    {
        content = source.content;
    }

}
