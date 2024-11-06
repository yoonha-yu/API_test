package org.example.dto;

import lombok.Getter;
import org.example.entity.Article;

import java.time.LocalDateTime;

@Getter
public class ArticleDTO {
    private final Long id;
    private final String subject;
    private final String content;
    private final String author;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;

    public ArticleDTO(Article article){
        this.id = article.getId();
        this.subject = article.getSubject();
        this.content = article.getContent();
        this.author = article.getAuthor();
        this.createdDate = article.getCreatedDate();
        this.modifiedDate = article.getModifiedDate();
    }
}
