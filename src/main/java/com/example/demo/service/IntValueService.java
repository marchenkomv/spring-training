package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;
import com.example.demo.entity.IntValue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntValueService {
    private IntValueRepository repository;
    private Map<String, Aggregation> operations;

    public IntValueService(IntValueRepository repository) {
        this.repository = repository;
        this.operations = new HashMap<>();
    }

    public void setOperations(Map<String, Aggregation> operations) {
        this.operations = operations;
    }

    public IntValue save(IntValue value) {
        return this.repository.save(value);
    }

    public Double aggregate(String operation, List<Integer> intList) throws IllegalArgumentException {
        if (operations.containsKey(operation)) {
            return operations.get(operation).aggregate(intList);
        }
        throw new IllegalArgumentException("Operation " + operation + " not found");
    }
}
