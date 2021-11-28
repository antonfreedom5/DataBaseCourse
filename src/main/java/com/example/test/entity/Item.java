package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @OneToOne
    private Educator educator;
}
