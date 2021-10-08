package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;

import java.util.List;

public abstract class Aggregation {
    protected IntValueRepository repository;

    public Aggregation(IntValueRepository repository) {
        this.repository = repository;
    }

    public abstract Double aggregate(List<Integer> intList);
}
