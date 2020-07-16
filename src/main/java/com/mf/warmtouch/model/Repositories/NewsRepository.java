package com.mf.warmtouch.model.Repositories;

import com.mf.warmtouch.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>
{

}
