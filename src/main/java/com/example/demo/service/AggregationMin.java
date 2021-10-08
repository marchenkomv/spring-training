package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class AggregationMin extends Aggregation {

    public AggregationMin(IntValueRepository repository) {
        super(repository);
    }

    @Override
    public Double aggregate(List<Integer> intList) {
        if (CollectionUtils.isEmpty(intList)) {
            return this.repository.min();
        } else {
            return this.repository.minById(intList);
        }
    }
}
