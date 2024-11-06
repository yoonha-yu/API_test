package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.ArticleDTO;
import org.example.entity.Article;
import org.example.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;
    public List<ArticleDTO> getList(){
        List <Article> articleList = this.articleRepository.findAll();

        List<ArticleDTO> articleDTOList = articleList.stream().map(article -> new ArticleDTO(article)).collect(Collectors.toList());

        return articleDTOList;
    }
    public Article getArticle( Long id){
        Optional<Article> optionalArticle = this.articleRepository.findById(id);

        return optionalArticle.orElse(null);
    }
    public Article write(String suject, String content){
        Article article = Article.builder().subject(suject).content(content).build();
        this.articleRepository.save(article);
        return article;
    }
    public Article update(Article article, String subject, String content){
        article.setSubject(subject);
        article.setContent(content);
        this.articleRepository.save(article);
        return article;
    }
    public void delete(Article article){
        this.articleRepository.delete(article);
    }
}
