package com.example.test.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    @OneToOne
    private Clazz clazz;
    private Date dateOfBirth;
    private String phone;
    @OneToMany
    private List<Score> scores;
}
