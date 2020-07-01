package com.mf.warmtouch.model.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewsDTO {
    private Integer id;
    private String title;
    private String content;
    private String convertedDateTime;

    public NewsDTO(Integer id, String title, String content, String convertedDateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.convertedDateTime = convertedDateTime;
    }


}
