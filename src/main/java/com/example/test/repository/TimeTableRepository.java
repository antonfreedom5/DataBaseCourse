package com.example.test.repository;

import com.example.test.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TimeTableRepository extends JpaRepository<TimeTable, Date>{
}
