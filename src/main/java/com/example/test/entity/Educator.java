package com.example.test.entity;

import javax.persistence.*;

@Entity
public class Educator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Office office;
}
