package org.example.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.entity.Article;

@Getter
@AllArgsConstructor
public class ArticleModifyResponse {
    private final Article article;
}
