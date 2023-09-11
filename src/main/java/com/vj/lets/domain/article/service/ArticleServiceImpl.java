package com.vj.lets.domain.article.service;

import com.vj.lets.domain.article.dto.Article;
import com.vj.lets.domain.article.mapper.ArticleHistoryMapper;
import com.vj.lets.domain.article.mapper.ArticleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* 클래스 설명 : Article 서비스 구현체
* 작성일 : 2023-09-08
* @author : 이한솔
*/
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {
    private final ArticleMapper articleMapper;
    private final ArticleHistoryMapper articleHistoryMapper;

    @Transactional
    @Override
    public void creat(Article article) {
        articleMapper.creat(article);
        articleHistoryMapper.creat();
    }

    @Override
    public Article search(String keyword) {
        return articleMapper.search(keyword);
    }

    @Transactional
    @Override
    public void update(Article article) {
        articleMapper.update(article);
        articleHistoryMapper.update(article.getId());
    }

    @Transactional
    @Override
    public void delete(int id) {
        articleMapper.delete(id);
        articleHistoryMapper.delete(id);
    }

//    @Override
//    public List<Article> findAll() {
//        return null;
//    }
}