package com.mf.warmtouch.services;

import com.mf.warmtouch.model.Repositories.ItemRepository;
import com.mf.warmtouch.model.Repositories.PricelistRepository;
import com.mf.warmtouch.model.dtos.PricelistItemDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopItemService
{
    private PricelistRepository repository;

    ShopItemService(PricelistRepository repository) {
        this.repository = repository;
    }

    public List<PricelistItemDTO> findAll()
    {
        var entityList = repository.findAll();
        List<PricelistItemDTO> dtoList = new ArrayList<>();

        entityList.forEach(entity -> dtoList.add(
                new PricelistItemDTO(entity)
        ));
        return dtoList;
    }
}
