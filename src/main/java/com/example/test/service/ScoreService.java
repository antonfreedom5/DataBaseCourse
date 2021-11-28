package com.example.test.service;

import com.example.test.entity.Score;
import com.example.test.repository.OfficeRepository;
import com.example.test.repository.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScoreService {
    private final ScoreRepository scoreRepository;

    public void add(Long value){
        Score score = new Score();
        score.setValue(value);

        scoreRepository.save(score);
    }
    public List<Long> getAll() {
        return scoreRepository.findAll().stream().map(Score::getValue).collect(Collectors.toList());
    }
}
