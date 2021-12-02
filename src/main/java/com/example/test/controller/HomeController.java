package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String home() {
        return "<a href='http://localhost:8080/clazz'>Класс</a></br>" +
                "<a href='http://localhost:8080/educator'>Преподаватель</a>";
    }
}
