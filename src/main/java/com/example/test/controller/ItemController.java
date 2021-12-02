package com.example.test.controller;

import com.example.test.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/add")
    public String addItem(@RequestParam String itemName,
                          @RequestParam String educatorName) {
        itemService.add(itemName, educatorName);
        return "Предмет успешно создан!";
    }

    @GetMapping("/getAll")
    public List<String> getAll() {
        return itemService.getAll();
    }
}
