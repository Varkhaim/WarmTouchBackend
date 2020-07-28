package com.mf.warmtouch.controller;

import com.mf.warmtouch.model.Repositories.ItemRepository;
import com.mf.warmtouch.services.ShopItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {

    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
    private ItemRepository itemRepository;
    private ShopItemService shopItemService;

    ShopController(ItemRepository itemRepository, ShopItemService shopItemService) {
        this.itemRepository = itemRepository;
        this.shopItemService = shopItemService;
    }

    @CrossOrigin
    @GetMapping("/all")
    ResponseEntity<?> getAll()
    {
        logger.info("ItemRepository: Finding all");
        var allItems = shopItemService.findAll();
        return ResponseEntity.ok(allItems);
    }

    @CrossOrigin
    @GetMapping("/packets")
    ResponseEntity<?> getAllPackets()
    {
        logger.info("ItemRepository: Finding all packets");
        var allItems = itemRepository.findAllPackets();
        return ResponseEntity.ok(allItems);
    }

    @CrossOrigin
    @GetMapping("/services")
    ResponseEntity<?> getAllServices()
    {
        logger.info("ItemRepository: Finding all services");
        var allItems = itemRepository.findAllServices();
        return ResponseEntity.ok(allItems);
    }

    @CrossOrigin
    @GetMapping("/categories/{category}")
    ResponseEntity<?> getAllCategoryItems(@PathVariable("category") String category)
    {
        logger.info("ItemRepository: Finding all items of category: " + category);
        var allItems = itemRepository.findAllItemsOfType(category);
        return ResponseEntity.ok(allItems);
    }

    @CrossOrigin
    @GetMapping("/categories")
    ResponseEntity<?> getAllCategories()
    {
        logger.info("ItemRepository: Finding all types");
        var allItems = itemRepository.findAllTypes();
        return ResponseEntity.ok(allItems);
    }
}
