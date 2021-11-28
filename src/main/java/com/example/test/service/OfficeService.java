package com.example.test.service;

import com.example.test.entity.Office;
import com.example.test.repository.OfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OfficeService {
    private final OfficeRepository officeRepository;

    public void add(Long number){
        Office office = new Office();
        office.setNumber(number);

        officeRepository.save(office);
    }
    public List<Long>getAll() {
        return officeRepository.findAll().stream().map(Office::getNumber).collect(Collectors.toList());
    }
}
