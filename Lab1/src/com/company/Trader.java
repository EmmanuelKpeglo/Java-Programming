package com.company;

public class Trader {

    private String name;
    public Account traderAccount;

    public Trader(String name) {
        this.traderAccount = new Account();
        this.name = name;

    }

    public double retrieveTotalTrade () {
        return traderAccount.getTotalTrade();
    }

    public void addTrade (Trade t1) {
        traderAccount.setTotalTrade(t1.getPrice() * t1.getQuantity());
    }

}
