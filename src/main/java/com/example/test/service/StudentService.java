package com.example.test.service;

import com.example.test.entity.Clazz;
import com.example.test.entity.Student;
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

    public void add(String studentName, String clazzName, Date dateOfBirth, String phone) {
        Student student = new Student();
        student.setName(studentName);
        Clazz clazz = clazzService.getByName(clazzName).orElse(null);
        student.setClazz(clazz);
        student.setDateOfBirth(dateOfBirth);
        student.setPhone(phone);

        studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
