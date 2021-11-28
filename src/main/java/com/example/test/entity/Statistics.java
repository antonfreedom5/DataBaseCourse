package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
