package com.mf.warmtouch.controller;

import com.mf.warmtouch.authentication.WTUserDetails;
import com.mf.warmtouch.model.Repositories.ItemRepository;
import com.mf.warmtouch.model.User;
import com.mf.warmtouch.services.ShopItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

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
        List<GrantedAuthority> authorities = (List<GrantedAuthority>) WTUserDetails.getCurrentUser().getAuthorities();
        boolean hasRole = authorities.contains(new SimpleGrantedAuthority("ADMIN"));
        logger.info("ItemRepository: Finding all");
        if (hasRole) {
            var allItems = shopItemService.findAll();
            return ResponseEntity.ok(allItems);
        }
        return ResponseEntity.noContent().build();
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
}
