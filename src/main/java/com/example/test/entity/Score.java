package com.example.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long value;
    @ManyToMany
    private List<Item> items;
}
