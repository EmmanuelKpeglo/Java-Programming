package com.company;

public class Trader {

    private String name;
    public Account traderAccount;

    public Trader(String name) {
        this.traderAccount = new Account();
        this.name = name;

    }

}
