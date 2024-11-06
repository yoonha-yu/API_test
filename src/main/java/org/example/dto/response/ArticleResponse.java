package org.example.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.entity.Article;

@Getter
@AllArgsConstructor
public class ArticleResponse {
    private final Article article;
}
