package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long value;
    @OneToOne
    private Item item;
}
