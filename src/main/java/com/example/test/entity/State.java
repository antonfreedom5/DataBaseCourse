package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class State {
    @Id
    private Long id;
    @OneToMany
    private List<Student> students;
}
