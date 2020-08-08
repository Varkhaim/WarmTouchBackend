package com.mf.warmtouch.model.entities;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shopitems")
@SQLDelete(sql = "UPDATE user SET deleted=true WHERE id=?")
@Where(clause = "deleted = false")
public class ShopItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Long price;

    @Column(name = "duration")
    private Long duration;


    @Column(name = "deleted")
    @ColumnDefault("false")
    private Boolean deleted;

    public void updateFrom(final ShopItem source)
    {
        name = source.name;
        price = source.price;
        duration = source.duration;
    }

}
