package com.example.currency_exchange.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExchangeRate {
    private String ccy;
    private String base_ccy;
    private BigDecimal buy;
    private BigDecimal sale;

    public String getCcy() {
        return ccy;
    }

    public BigDecimal getSale() {
        return sale;
    }
}