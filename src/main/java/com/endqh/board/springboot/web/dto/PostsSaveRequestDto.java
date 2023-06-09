package com.endqh.board.springboot.web.dto;

import com.endqh.board.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    private Long authorId;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, Long authorId) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.authorId = authorId;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .authorId(authorId)
                .build();
    }

}

