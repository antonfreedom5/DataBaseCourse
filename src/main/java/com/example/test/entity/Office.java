package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Office {
    @Id
    private Long id;
    private Long number;
}
