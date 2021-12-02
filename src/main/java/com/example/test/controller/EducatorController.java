package com.example.test.controller;

import com.example.test.service.EducatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/educator")
@RequiredArgsConstructor
public class EducatorController {
    private final EducatorService educatorService;

    @GetMapping("/add")
    public String addEducator(@RequestParam String name) {
        educatorService.add(name);
        return "Преподаватель успешно создан!";
    }

    @GetMapping("/getAll")
    public List<String> getAll() {
        return educatorService.getAll();
    }
}
