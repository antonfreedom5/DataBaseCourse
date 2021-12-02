package com.example.test.controller;

import com.example.test.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statistics")
@RequiredArgsConstructor
public class StatisticsController {
    private final StatisticsService statisticsService;

    @GetMapping("/add")
    public String addStatistics(@RequestParam Integer firstGuarter) {
        statisticsService.add(firstGuarter);
        return "Оценка успешно создана!";

    }

    @GetMapping("/getAll")
    public List<Integer> getAll() {
        return statisticsService.getAll();
    }
}
