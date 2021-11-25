package com.example.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer firstGuarter;
    private Integer secondGuarter;
    private Integer thirdGuarter;
    private Integer fourthGuarter;
    @ManyToOne
    private Educator educator;
    @OneToMany
    private List<Score> scores;
}
