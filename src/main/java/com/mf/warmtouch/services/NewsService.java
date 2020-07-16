package com.mf.warmtouch.services;

import com.mf.warmtouch.model.Repositories.NewsRepository;
import com.mf.warmtouch.model.dtos.NewsDTO;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService
{
    private NewsRepository repository;

    NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    public List<NewsDTO> findAll()
    {
        var entityList = repository.findAll();
        List<NewsDTO> dtoList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        entityList.forEach(entity -> dtoList.add(
                new NewsDTO(entity.getId(),
                        entity.getTitle(),
                        entity.getContent(),
                        entity.getPostDate().format(formatter)
                )));
        return dtoList;
    }
}
