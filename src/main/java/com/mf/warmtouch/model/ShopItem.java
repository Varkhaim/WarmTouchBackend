package com.mf.warmtouch.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "shopitems")
public class ShopItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Column(name = "image_link")
    private String imageLink;

    public void updateFrom(final ShopItem source)
    {
        name = source.name;
        shortDescription = source.shortDescription;
        description = source.description;
        price = source.price;
        imageLink = source.imageLink;
    }
}
