package com.project.microservies.currencyconversion.proxy;


import com.project.microservies.currencyconversion.models.ConvertedCurrency;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("currency-exchange")
@RibbonClient("currency-exchange")
public interface CurrencyExchangeServiceProxy {

    @GetMapping("currency-exchange/{from}/to/{to}")
    public ConvertedCurrency retriveExchangeValue(@PathVariable("from") String from,
                                                  @PathVariable("to") String to);

}
