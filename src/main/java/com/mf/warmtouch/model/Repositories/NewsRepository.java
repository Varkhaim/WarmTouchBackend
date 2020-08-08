package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.entities.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>
{
    @Override
    Page<News> findAll(Pageable pageable);
}
