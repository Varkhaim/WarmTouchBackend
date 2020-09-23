package com.mf.warmtouch.services;

import com.mf.warmtouch.model.Repositories.NewsRepository;
import com.mf.warmtouch.model.dtos.NewsDTO;
import com.mf.warmtouch.model.entities.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService
{
    private NewsRepository repository;

    NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    public Page<NewsDTO> findAll(int page)
    {
        Pageable whichPage = PageRequest.of(page, 3);
        Page<News> entityList = repository.findAll(whichPage);
        Page<NewsDTO> dtoList = entityList.map(NewsDTO::new);
        return dtoList;
    }

    public List<NewsDTO> findAll()
    {
        List<News> entityList = repository.findAll();
        List<NewsDTO> dtoList = new ArrayList<>();
        for (News n : entityList)
        {
            dtoList.add(new NewsDTO(n));
        }
        return dtoList;
    }
}
