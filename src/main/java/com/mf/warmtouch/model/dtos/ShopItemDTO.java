package com.mf.warmtouch.model.dtos;

import com.mf.warmtouch.model.ShopItem;
import lombok.Data;

import javax.persistence.Column;

@Data
public class ShopItemDTO {

    private String name;
    private String shortDescription;
    private String description;
    private String price;
    private String imageLink;
    private String type;

    public ShopItemDTO(ShopItem shopItem) {
        name = shopItem.getName();
        shortDescription = shopItem.getShortDescription();
        description = shopItem.getDescription();
        price = shopItem.getPrice() + "zł / " + shopItem.getDuration() + "min";
        imageLink = shopItem.getImageLink();
        type = shopItem.getType();
    }


}
