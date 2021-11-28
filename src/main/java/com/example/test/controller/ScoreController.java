package com.example.test.controller;

import com.example.test.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {
    private ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping("/add")
    public String addScore(@RequestParam Long value) {
        scoreService.add(value);
        return "Оценка успешно создана!";
    }

    @GetMapping("/getAll")
    public List<Long> getAll() {
        return scoreService.getAll();
    }
}
