package org.example.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.dto.ArticleDTO;
import org.example.entity.Article;

import java.util.List;

@Getter
@AllArgsConstructor
public class ArticlesResponse {
    private final List<ArticleDTO> article;
}
