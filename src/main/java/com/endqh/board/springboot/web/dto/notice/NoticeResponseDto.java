package com.endqh.board.springboot.web.dto.notice;

import com.endqh.board.springboot.domain.notice.Notice;
import lombok.Getter;
import lombok.Setter;

@Getter
public class NoticeResponseDto {

    private Long id, authorId;
    private String title, content, author;

    @Setter
    private Long viewCount;

    public NoticeResponseDto(Notice entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.authorId = entity.getAuthorId();
    }

}
