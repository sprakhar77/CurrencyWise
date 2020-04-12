package com.project.microservices.limitservice.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "fallbackLimitsConfiguration")
    public LimitConfiguration retriveLimitsFromConfiguration(){
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }

    public LimitConfiguration fallbackLimitsConfiguration() {
        return new LimitConfiguration(10, 1000);
    }
}
