package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Educator {
    @Id
    private Long id;
    private String name;
    @OneToOne
    private Office office;
}
