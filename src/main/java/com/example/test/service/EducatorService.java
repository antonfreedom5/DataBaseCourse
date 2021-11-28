package com.example.test.service;

import com.example.test.entity.Educator;
import com.example.test.repository.EducatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EducatorService {
    private final EducatorRepository educatorRepository;

    public void add(String name) {
        Educator educator = new Educator();
        educator.setName(name);

        educatorRepository.save(educator);
    }

    public List<String> getAll() {
        return educatorRepository.findAll().stream().map(Educator::getName).collect(Collectors.toList());
    }
}