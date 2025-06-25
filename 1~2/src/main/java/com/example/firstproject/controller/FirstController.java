package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") //greetings.mustache url 요청 접수
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "yeonsu");
        return "greetings"; //greetings.mustache 파일 반환
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "yeonsu");
        return "goodbye";
    }
}
