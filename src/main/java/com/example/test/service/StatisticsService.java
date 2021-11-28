package com.example.test.service;

import com.example.test.entity.Score;
import com.example.test.entity.Statistics;
import com.example.test.repository.ScoreRepository;
import com.example.test.repository.StatisticsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StatisticsService {
    private final StatisticsRepository statisticsRepository;

    public void add(Integer firstGuarter){
        Statistics statistics = new Statistics();
        statistics.setFirstGuarter(firstGuarter);

        statisticsRepository.save(statistics);
    }
    public List<Integer> getAll() {
        return statisticsRepository.findAll().stream().map(Statistics::getFirstGuarter).collect(Collectors.toList());
    }
}
