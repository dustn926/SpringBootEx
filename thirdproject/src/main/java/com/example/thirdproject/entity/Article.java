package com.example.thirdproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Article {
    //엔티티의 대푯값 지정
    @Id
    @GeneratedValue //자동 생성 기능 추가(숫자가 자동으로 매겨짐)
    private Long id;
    @Column //title 필드 선언, DB 테이블의 title 열과 연결됨
    private String title;
    @Column //content 필드 선언, DB 테이블의 content 열과 연결됨
    private String content;

    //생성자 추가
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    //toString() 메소드 추가
    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
