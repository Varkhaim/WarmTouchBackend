package com.mf.warmtouch.model.dtos;

import com.mf.warmtouch.model.ItemCategory;
import com.mf.warmtouch.model.PricelistItem;
import com.mf.warmtouch.model.ShopItem;
import lombok.Data;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PricelistItemDTO {

    private List<ShopItemDTO> shopItemDTOS;
    private String description;
    private String imageLink;
    private ItemCategory type;

    public PricelistItemDTO(PricelistItem pricelistItem) {
        shopItemDTOS = pricelistItem.getShopItems().stream().map(ShopItemDTO::new).collect(Collectors.toList());
        description = pricelistItem.getDescription();
        imageLink = pricelistItem.getImageLink();
        type = pricelistItem.getType();
    }


}
