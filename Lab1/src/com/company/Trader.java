package com.company;

public class Trader {

    private String name;
    private Account traderAccount;

    public Trader(String name, Account traderAccount) {
        this.name = name;
        this.traderAccount = traderAccount;
    }

    public Trader(String a1) {
    }

    public double retrieveTotalTrade () {
        return traderAccount.getTotalTrade();
    }

    public void addTrade (Trade t1) {
        this.traderAccount.setTotalTrade(t1.getPrice() * t1.getQuantity());
    }

}
