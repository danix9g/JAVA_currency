package com.example.currency_exchange.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class ExchangeRateService {
    public Map<String, BigDecimal> getExchangeRates() {
        Map<String, BigDecimal> rates = new HashMap<>();
        rates.put("PLN", BigDecimal.valueOf(10.54));
        rates.put("EUR", BigDecimal.valueOf(45.40));
        return rates;
    }
}
