package com.example.test.service;

import com.example.test.entity.Clazz;
import com.example.test.entity.Score;
import com.example.test.entity.Student;
import com.example.test.repository.ItemRepository;
import com.example.test.repository.ScoreRepository;
import com.example.test.repository.StateRepository;
import com.example.test.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final ClazzService clazzService;
    private final ItemRepository itemRepository;
    private final ScoreRepository scoreRepository;
    private final StateRepository stateRepository;

    public void add(String studentName, String clazzName, Date dateOfBirth, String phone, String state) {
        Student student = new Student();
        student.setName(studentName);
        Clazz clazz = clazzService.getByName(clazzName).orElse(null);
        student.setClazz(clazz);
        student.setDateOfBirth(dateOfBirth);
        student.setPhone(phone);

        student.setState(stateRepository.findByName(state));

        studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public void addScore(String studentName, String itemName, Long value) {
        studentRepository.findByName(studentName).ifPresent(student -> {
            itemRepository.findByName(itemName).ifPresent(item -> {
                Score score = new Score();
                score.setValue(value);
                score.setItem(item);
                scoreRepository.save(score);
                List<Score> scores = student.getScores();
                scores.add(score);
                student.setScores(scores);
                studentRepository.save(student);
            });
        });
    }
}
