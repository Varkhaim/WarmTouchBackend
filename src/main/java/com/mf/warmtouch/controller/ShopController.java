package com.mf.warmtouch.controller;

import com.mf.warmtouch.model.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
    private ItemRepository itemRepository;

    ShopController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @CrossOrigin
    @GetMapping("/all")
    ResponseEntity<?> GetAllItems()
    {
        logger.info("ItemRepository: Finding all");
        var allItems = itemRepository.findAll();
        return ResponseEntity.ok(allItems);
    }
}
