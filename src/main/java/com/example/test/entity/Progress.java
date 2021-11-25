package com.example.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Student> students;
    @OneToMany
    private List<Score> scores;
}
