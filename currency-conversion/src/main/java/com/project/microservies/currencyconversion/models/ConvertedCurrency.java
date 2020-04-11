package com.project.microservies.currencyconversion.models;

public class ConvertedCurrency {

    private int id;
    private String from;
    private String to;
    private int conversionMultiple;
    private int quantity;
    private int convertedValue;
    private int port;

    public ConvertedCurrency(int id, String from, String to, int conversionMultiple, int quantity, int convertedValue, int port) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.convertedValue = convertedValue;
        this.port = port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(int conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(int convertedValue) {
        this.convertedValue = convertedValue;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
