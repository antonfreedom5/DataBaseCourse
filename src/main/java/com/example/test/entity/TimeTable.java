package com.example.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Data
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
