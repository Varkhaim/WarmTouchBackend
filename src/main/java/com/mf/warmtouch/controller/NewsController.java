package com.mf.warmtouch.controller;

import com.mf.warmtouch.model.News;
import com.mf.warmtouch.model.NewsRepository;
import com.mf.warmtouch.services.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/test")
public class NewsController
{
    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
    private NewsService newsService;
    private NewsRepository newsRepository;

    NewsController(NewsService newsService, NewsRepository newsRepository)
    {
        this.newsService = newsService;
        this.newsRepository = newsRepository;
    }

    @GetMapping("/ok")
    ResponseEntity<?> TestMethod()
    {
        return ResponseEntity.ok(newsService.TestMethod());
    }

    @GetMapping("/lol")
    ResponseEntity<?> Something()
    {
        var test1 = newsRepository.findById(0);
        var test2 = test1.get();
        var test3 = ResponseEntity.ok(test2);
        return ResponseEntity.ok(test3);
    }

    @CrossOrigin
    @GetMapping("/all")
    ResponseEntity<?> GetAllNews()
    {
        logger.info("Finding all");
        var allNews = newsService.findAll();
        return ResponseEntity.ok(allNews);
    }

    @CrossOrigin
    @PostMapping("/news")
    ResponseEntity<?> createNews(@RequestBody News toCreate)
    {
        News newNews = newsRepository.save(toCreate);

        if (newNews == null)
        {
            return ResponseEntity.noContent().build();
        }
        logger.info("Creating: " + newNews.getId());
        return ResponseEntity.created(URI.create("/" + newNews.getId())).body(newNews);
    }

    @CrossOrigin
    @DeleteMapping("/news/{id}")
    ResponseEntity<?> deleteNews(@PathVariable("id") int id)
    {
        logger.info("Removing: " + id);
        if (newsRepository.findById(id).isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        newsRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @CrossOrigin
    @PutMapping("/news/{id}")
    ResponseEntity<?> editNews(@PathVariable("id") int id, @RequestBody News editedNews)
    {
        logger.info("Editing: " + id);
        if (newsRepository.findById(id).isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        newsRepository.findById(id).ifPresent(news -> {
            news.updateFrom(editedNews);
            newsRepository.save(news);
        });
        return ResponseEntity.noContent().build();
    }
}
