package com.company;

public class Account {

    private double totalTrade;

    public Account() {
        this.totalTrade = 0.0;
    }

    public void setTotalTrade(double total) {
        this.totalTrade += total;
    }

    public double getTotalTrade() {
        return totalTrade;
    }

}
