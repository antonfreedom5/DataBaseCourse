package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Score {
    @Id
    private Long id;
    private Long value;
    @ManyToMany
    private List<Item> items;
}
