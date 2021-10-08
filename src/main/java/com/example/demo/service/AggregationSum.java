package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class AggregationSum extends Aggregation {

    public AggregationSum(IntValueRepository repository) {
        super(repository);
    }

    @Override
    public Double aggregate(List<Integer> intList) {
        if (CollectionUtils.isEmpty(intList)) {
            return this.repository.sum();
        } else {
            return this.repository.sumById(intList);
        }
    }
}
