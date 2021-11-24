package com.example.test.controller;

import com.example.test.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/clazz")
@RestController
public class ClazzController {
    private ClazzService clazzService;

    @Autowired
    public ClazzController(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    @GetMapping("/add")
    public String addClazz(@RequestParam String name) {
        clazzService.add(name);
        return "Класс успешно создан!";
    }

    @GetMapping("/getAll")
    public List<String> getAll() {
        return clazzService.getAll();
    }
}
