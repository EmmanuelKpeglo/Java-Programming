package com.company;

public class FundTrade extends Trade{

    public FundTrade(String ID, String symbol, int quantity, double price, double dividendPercentage) {
        super(ID, symbol, quantity, price);
        this.dividendPercentage = dividendPercentage;
    }

    final double dividendPercentage;

    @Override
    public double calcDividend() {
        return (dividendPercentage/100) * super.getPrice();
    }
}
