package com.mf.warmtouch.controller;

import com.mf.warmtouch.model.Repositories.AboutMeRepository;
import com.mf.warmtouch.model.Repositories.DayAvailabilityRepository;
import com.mf.warmtouch.services.AboutMeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workhour")
public class DayAvailabilityController
{
    private static final Logger logger = LoggerFactory.getLogger(DayAvailabilityController.class);
    private DayAvailabilityRepository repository;

    DayAvailabilityController(DayAvailabilityRepository repository, AboutMeService service) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/all")
    ResponseEntity<?> GetAllNews()
    {
        logger.info("Getting Day Availability");
        var aboutMe = repository.findAll();
        return ResponseEntity.ok(aboutMe);
    }
}
