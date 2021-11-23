package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Progress {
    @Id
    private Long id;
    @OneToMany
    private List<Student> students;
    @OneToMany
    private List<Score> scores;
}
