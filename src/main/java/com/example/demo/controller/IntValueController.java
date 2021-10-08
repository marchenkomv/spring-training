package com.example.demo.controller;

import com.example.demo.entity.IntValue;
import com.example.demo.service.IntValueService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IntValueController {

    private final IntValueService intValueService;

    public IntValueController(IntValueService intValueService) {
        this.intValueService = intValueService;
    }

    @PostMapping(path = "api/v1/values")
    @ResponseStatus(HttpStatus.CREATED)
    public String createNewIntValue(@RequestBody IntValue value) {
        return this.intValueService.save(value).getId().toString();
    }

    @GetMapping(path = "api/v1/values/{operation}")
    public Double aggregate(@PathVariable() String operation,
                            @RequestParam(required = false) List<Integer> id) {
        return this.intValueService.aggregate(operation, id);
    }
}
