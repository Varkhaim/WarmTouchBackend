package com.mf.warmtouch.services;

import com.mf.warmtouch.model.Repositories.AboutMeRepository;
import com.mf.warmtouch.model.Repositories.NewsRepository;
import com.mf.warmtouch.model.dtos.AboutMeDTO;
import com.mf.warmtouch.model.dtos.NewsDTO;
import com.mf.warmtouch.model.entities.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AboutMeService
{
    private AboutMeRepository repository;

    AboutMeService(AboutMeRepository repository) {
        this.repository = repository;
    }

    public List<AboutMeDTO> findAll()
    {
        return repository.findAll().stream().map(AboutMeDTO::new).collect(Collectors.toList());
    }
}
