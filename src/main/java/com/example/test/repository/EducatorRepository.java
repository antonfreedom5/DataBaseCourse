package com.example.test.repository;

import com.example.test.entity.Educator;
import com.example.test.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducatorRepository extends JpaRepository<Educator, String> {
    Optional<Educator> findByName(String name);
}
