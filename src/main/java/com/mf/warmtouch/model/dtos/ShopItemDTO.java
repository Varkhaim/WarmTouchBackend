package com.mf.warmtouch.model.dtos;

import com.mf.warmtouch.model.ItemCategory;
import com.mf.warmtouch.model.PricelistItem;
import com.mf.warmtouch.model.ShopItem;
import lombok.Data;

@Data
public class ShopItemDTO {

    private String name;
    private String description;
    private String price;
    private String imageLink;
    private ItemCategory type;

    public ShopItemDTO(ShopItem shopItem) {
        name = shopItem.getName();
        price = shopItem.getPrice().toString() + "zł / " + shopItem.getDuration().toString() + "min";
    }


}
