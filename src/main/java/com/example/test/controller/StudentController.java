package com.example.test.controller;

import com.example.test.entity.Student;
import com.example.test.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/add")
    public String add(@RequestParam String studentName,
                      @RequestParam String clazzName,
                      @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") Date dateOfBirth,
                      @RequestParam String phone) {
        studentService.add(studentName, clazzName, dateOfBirth, phone);
        return "Ученик успешно добавлен!";
    }

    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studentService.getAll();
    }
}
