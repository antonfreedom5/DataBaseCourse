package com.example.test.controller;

import com.example.test.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
@RequiredArgsConstructor
public class StateController {
    private final StateService stateService;

    @GetMapping("/add")
    public String add(@RequestParam String name) {
        stateService.add(name);
        return "Состояние успешно добавлено!";
    }
}
