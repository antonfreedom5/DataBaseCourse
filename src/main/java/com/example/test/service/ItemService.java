package com.example.test.service;

import com.example.test.entity.Item;
import com.example.test.repository.EducatorRepository;
import com.example.test.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;
    private final EducatorRepository educatorRepository;

    public void add(String itemName, String educatorName) {
        educatorRepository.findByName(educatorName).ifPresent(educator -> {
            Item item = new Item();
            item.setName(itemName);
            item.setEducator(educator);
            itemRepository.save(item);
        });
    }

    public List<String> getAll() {
        return itemRepository.findAll().stream().map(Item::getName).collect(Collectors.toList());
    }
}
