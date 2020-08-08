package com.mf.warmtouch.model.dtos;

import com.mf.warmtouch.model.entities.News;
import lombok.Data;

@Data
public class AboutMeElement {
    private String type;
    private String content;

    public AboutMeElement(String content, String type) {
        this.content = content;
        this.type = type;
    }

}
