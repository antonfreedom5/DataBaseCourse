package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clazz {
    @Id
    private Long id;
    private String name;
}
