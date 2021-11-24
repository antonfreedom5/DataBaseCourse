package com.example.test.service;

import com.example.test.entity.Clazz;
import com.example.test.repository.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClazzService {
    private ClazzRepository clazzRepository;

    @Autowired
    public ClazzService(ClazzRepository clazzRepository) {
        this.clazzRepository = clazzRepository;
    }

    public void add(String name) {
        Clazz clazz = new Clazz();
        clazz.setName(name);
        clazzRepository.save(clazz);
    }

    public List<String> getAll() {
        return clazzRepository.findAll().stream().map(Clazz::getName).collect(Collectors.toList());
    }
}
