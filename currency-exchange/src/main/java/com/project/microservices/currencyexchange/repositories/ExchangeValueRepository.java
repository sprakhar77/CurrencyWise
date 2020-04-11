package com.project.microservices.currencyexchange.repositories;

import com.project.microservices.currencyexchange.models.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Integer> {

    ExchangeValue findByFromAndTo(String from, String to);
}
