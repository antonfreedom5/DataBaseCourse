package com.example.test.service;

import com.example.test.entity.Clazz;
import com.example.test.repository.ClazzRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClazzService {
    private final ClazzRepository clazzRepository;

    public void add(String name) {
        Clazz clazz = clazzRepository.findByName(name).orElse(new Clazz());
        clazz.setName(name);

        clazzRepository.save(clazz);
    }

    public Optional<Clazz> getByName(String name) {
        return clazzRepository.findByName(name);
    }

    public List<String> getAll() {
        return clazzRepository.findAll().stream().map(Clazz::getName).collect(Collectors.toList());
    }
}
