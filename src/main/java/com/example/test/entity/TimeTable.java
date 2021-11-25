package com.example.test.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date day;
    @OneToMany
    private List<Office> offices;
    @OneToMany
    private List<Item> items;
    @OneToMany
    private List<Educator> educators;
    @OneToMany
    private List<Clazz> clazzes;
}
