package com.example.limitserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitserver.Configuration;
import com.example.limitserver.models.Limit;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class LimitConfigController {
    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public Limit getConFig() {
        return new Limit(configuration.getMaximum(), configuration.getMinimum());  
    }
}
