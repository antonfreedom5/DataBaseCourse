package com.example.test.controller;

import com.example.test.service.EducatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/educator")
public class EducatorController {
    private EducatorService educatorService;

    @Autowired
    public EducatorController(EducatorService educatorService) {
        this.educatorService = educatorService;
    }

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