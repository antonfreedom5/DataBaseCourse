package com.example.test.controller;

import com.example.test.service.ClazzService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/clazz")
@RestController
@RequiredArgsConstructor
public class ClazzController {
    private final ClazzService clazzService;

    @GetMapping()
    public String clazzHome() {
        return "<a href='http://localhost:8080/clazz/addForm'>Создать класс</a></br>" +
                "<a href='http://localhost:8080/clazz/getAll'>Показать все классы</a>";
    }

    @GetMapping("/addForm")
    public String addClazzForm() {
        return "<form action='http://localhost:8080/clazz/add'>" +
                "Название класса: <input type='text' name='clazzName'/></br>" +
                "<button type='submit'>Создать</button>" +
                "</form>";
    }

    @GetMapping("/add")
    public String addClazz(@RequestParam String clazzName) {
        clazzService.add(clazzName);
        return "Класс успешно создан!";
    }

    @GetMapping("/getAll")
    public String getAll() {
        return "<a href='http://localhost:8080/'>На главную</a></br>" + clazzService.getAll().toString();
    }
}
