package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
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
