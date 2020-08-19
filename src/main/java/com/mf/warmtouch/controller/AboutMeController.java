package com.mf.warmtouch.controller;

import com.mf.warmtouch.model.Repositories.AboutMeRepository;
import com.mf.warmtouch.model.Repositories.NewsRepository;
import com.mf.warmtouch.model.entities.News;
import com.mf.warmtouch.services.AboutMeService;
import com.mf.warmtouch.services.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/about")
public class AboutMeController
{
    private static final Logger logger = LoggerFactory.getLogger(AboutMeController.class);
    private AboutMeRepository repository;
    private AboutMeService service;

    AboutMeController(AboutMeRepository repository, AboutMeService service) {
        this.repository = repository;
        this.service = service;
    }

    @CrossOrigin
    @GetMapping("/all")
    ResponseEntity<?> GetAllNews()
    {
        logger.info("Getting About Me");
        var aboutMe = service.findAll();
        return ResponseEntity.ok(aboutMe);
    }
}
