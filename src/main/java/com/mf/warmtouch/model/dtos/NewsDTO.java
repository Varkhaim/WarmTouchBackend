package com.mf.warmtouch.model.dtos;

import com.mf.warmtouch.model.entities.News;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewsDTO {
    private Integer id;
    private String title;
    private String content;
    private String time;
    private String type;

    public NewsDTO(Integer id, String title, String content, String time, String type) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.type = type;
    }

    public NewsDTO(News news)
    {
        this.id = news.getId();
        this.title = news.getTitle();
        this.content = news.getContent();
        this.time = news.getPostDate();
        this.type = news.getType().toString();
    }
}
