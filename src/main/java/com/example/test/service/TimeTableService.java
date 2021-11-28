package com.example.test.service;

import com.example.test.entity.TimeTable;
import com.example.test.repository.TimeTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class TimeTableService {
    private final TimeTableRepository timeTableRepository;

    public void add(Date day){
        TimeTable timeTable = new TimeTable();
        timeTable.setDay(day);

        timeTableRepository.save(timeTable);
    }
    public List<TimeTable> getAll() {
        return timeTableRepository.findAll();
    }
}
