package com.example.test.controller;


import com.example.test.entity.TimeTable;
import com.example.test.service.TimeTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/timeTable")
public class TimeTableController {
    private TimeTableService timeTableService;

    @Autowired
    public TimeTableController(TimeTableService timeTableService) {
        this.timeTableService = timeTableService;
    }

    @GetMapping("/add")
    public String addTimeTable(@DateTimeFormat(pattern = "dd.MM.yyyy")  Date day) {
        timeTableService.add(day);
        return "День успешно создан!";

    }

    @GetMapping("/getAll")
    public List<TimeTable> getAll() {
        return timeTableService.getAll();
    }
}
