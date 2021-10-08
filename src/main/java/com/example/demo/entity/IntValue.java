package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "int_values")
public class IntValue {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer value;

    public Integer getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
