package com.example.demo.repository;

import com.example.demo.entity.IntValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IntValueRepository extends JpaRepository<IntValue, Integer> {

    IntValue save(IntValue value);

    @Query("SELECT SUM(value) FROM IntValue")
    Double sum();

    @Query("SELECT SUM(value) FROM IntValue WHERE id IN (?1)")
    Double sumById(List<Integer> intList);

    @Query("SELECT MIN(value) FROM IntValue")
    Double min();

    @Query("SELECT MIN(value) FROM IntValue WHERE id IN (?1)")
    Double minById(List<Integer> intList);

    @Query("SELECT MAX(value) FROM IntValue")
    Double max();

    @Query("SELECT MAX(value) FROM IntValue WHERE id IN (?1)")
    Double maxById(List<Integer> intList);

    @Query("SELECT AVG(value) FROM IntValue")
    Double avg();

    @Query("SELECT AVG(value) FROM IntValue WHERE id IN (?1)")
    Double avgById(List<Integer> intList);
}
