package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Statistics {
    @Id
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
