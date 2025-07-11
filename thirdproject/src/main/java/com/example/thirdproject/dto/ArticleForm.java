package com.example.thirdproject.dto;

import com.example.thirdproject.entity.Article;

public class ArticleForm {
    private String title; //제목 받을 필드
    private String content; // 내용 받을 필드

    //전송받은 제목과 내용을 필드에 저장하는 생성자 추가
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //데이터를 잘 받았는지 확인할 toString() 메소드 추가
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
