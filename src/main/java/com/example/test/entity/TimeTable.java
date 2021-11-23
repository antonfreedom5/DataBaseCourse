package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Entity
public class TimeTable {
    @Id
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
