package com.example.test.controller;

import com.example.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/add")
    public String addItem(@RequestParam String name) {
        itemService.add(name);
        return "Предмет успешно создан!";
    }

    @GetMapping("/getAll")
    public List<String> getAll() {
        return itemService.getAll();
    }
}
