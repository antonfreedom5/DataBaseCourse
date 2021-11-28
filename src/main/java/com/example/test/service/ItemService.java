package com.example.test.service;

import com.example.test.entity.Item;
import com.example.test.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public void add(String name) {
        Item item = new Item();
        item.setName(name);

        itemRepository.save(item);
    }

    public List<String> getAll() {
        return itemRepository.findAll().stream().map(Item::getName).collect(Collectors.toList());
    }
}
