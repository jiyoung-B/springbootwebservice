package com.example.springbootwebservice.web.dto;

import com.example.springbootwebservice.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSaveResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
