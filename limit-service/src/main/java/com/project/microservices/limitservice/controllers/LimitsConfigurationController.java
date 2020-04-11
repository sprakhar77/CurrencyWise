package com.project.microservices.limitservice.controllers;

import com.project.microservices.limitservice.beans.LimitConfiguration;
import com.project.microservices.limitservice.configurations.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
