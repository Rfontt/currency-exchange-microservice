package com.microservice.currencyexchange.entities;

public class CurrencyExchange {
    final private String from;
    final private String to;

    public CurrencyExchange(String from, String to) {
        this.from = from;
        this.to = to;
    }
}
