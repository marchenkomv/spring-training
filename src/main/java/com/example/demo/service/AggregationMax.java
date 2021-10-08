package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class AggregationMax extends Aggregation {

    public AggregationMax(IntValueRepository repository) {
        super(repository);
    }

    @Override
    public Double aggregate(List<Integer> intList) {
        if (CollectionUtils.isEmpty(intList)) {
            return this.repository.max();
        } else {
            return this.repository.maxById(intList);
        }
    }
}
