package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToMany
    private List<Student> students;
    @OneToMany
    private List<Score> scores;
}
