package com.example.test.controller;

import com.example.test.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/office")
public class OfficeController {
    private OfficeService officeService;

    @Autowired
    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping("/add")
    public String addOffice(@RequestParam Long number) {
        officeService.add(number);
        return "Офис успешно создан!";
    }

    @GetMapping("/getAll")
    public List<Long> getAll() {
        return officeService.getAll();
    }

}
