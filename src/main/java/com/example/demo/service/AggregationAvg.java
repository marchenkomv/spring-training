package com.example.demo.service;

import com.example.demo.repository.IntValueRepository;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class AggregationAvg extends Aggregation {

    public AggregationAvg(IntValueRepository repository) {
        super(repository);
    }

    @Override
    public Double aggregate(List<Integer> intList) {
        if (CollectionUtils.isEmpty(intList)) {
            return this.repository.avg();
        } else {
            return this.repository.avgById(intList);
        }
    }
}
