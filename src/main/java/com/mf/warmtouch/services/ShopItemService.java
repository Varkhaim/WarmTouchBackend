package com.mf.warmtouch.services;

import com.mf.warmtouch.model.Repositories.ItemRepository;
import com.mf.warmtouch.model.dtos.ShopItemDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopItemService
{
    private ItemRepository repository;

    ShopItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<ShopItemDTO> findAll()
    {
        var entityList = repository.findAll();
        List<ShopItemDTO> dtoList = new ArrayList<>();

        entityList.forEach(entity -> dtoList.add(
                new ShopItemDTO(entity)
        ));
        return dtoList;
    }
}
