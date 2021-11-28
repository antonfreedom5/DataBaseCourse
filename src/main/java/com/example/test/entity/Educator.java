package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Educator {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToOne
    private Office office;
}
