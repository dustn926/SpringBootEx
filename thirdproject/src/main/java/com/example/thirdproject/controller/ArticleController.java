package com.example.thirdproject.controller;

import com.example.thirdproject.dto.ArticleForm;
import com.example.thirdproject.entity.Article;
import com.example.thirdproject.repository.ArticleRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//1. 컨트롤러 선언
public class ArticleController {
    @Autowired //new로 생성하는 대신 스프링 부트가 미리 생성해 놓은 리포지토리 객체 주입(DI)
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create") //"/articles/create"라는 url 요청 받아오기
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 1. DTO 를 엔티티로 변환
        Article article = form.toEntity();
        System.out.println(article.toString());
        // 2. 리포지토리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return ""; //반환 형식 맞춰주기
    }
}
