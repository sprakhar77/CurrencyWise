package com.project.microservies.currencyconversion.controllers;

import com.project.microservies.currencyconversion.models.ConvertedCurrency;
import com.project.microservies.currencyconversion.proxy.CurrencyExchangeServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

    private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public CurrencyConversionController(CurrencyExchangeServiceProxy currencyExchangeServiceProxy) {
        this.currencyExchangeServiceProxy = currencyExchangeServiceProxy;
    }

    @GetMapping("/currency-conversion/{from}/to/{to}/{quantity}")
    public ConvertedCurrency retriveConvertedCurrency(@PathVariable String from,
                                                      @PathVariable String to,
                                                      @PathVariable int quantity) {
        ConvertedCurrency response = currencyExchangeServiceProxy.retriveExchangeValue(from, to);
        response.setQuantity(quantity);
        response.setConvertedValue(response.getConversionMultiple() * quantity);
        logger.info("response -> {}", response);
        return response;
    }
}
