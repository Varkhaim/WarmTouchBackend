package com.mf.warmtouch.model.entities;

import com.mf.warmtouch.model.enums.ItemCategory;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "pricelist_items")
@SQLDelete(sql = "UPDATE user SET deleted=true WHERE id=?")
@Where(clause = "deleted = false")
public class PricelistItem
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "image_link")
    private String imageLink;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="pricelist_item_id")
    private List<ShopItem> shopItems = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ItemCategory type;

    @Column(name = "deleted")
    @ColumnDefault("false")
    private Boolean deleted;

    public void updateFrom(final PricelistItem source)
    {
        description = source.description;
        imageLink = source.imageLink;
        type = source.type;
    }

}
