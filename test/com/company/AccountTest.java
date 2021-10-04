package com.company;

import junit.framework.TestCase;

public class AccountTest extends TestCase {

    public void testSetTotalTrade() {
    }

    public void testGetTotalTrade() {
    }

    public void testAddTrade() {
        Account a1 = new Account();
        Trade t2 = new Trade("1", "AAPL", 1000, 50.9);
        Trade t3 = new Trade("2", "IBM", 1000, 70.5);

        a1.addTrade(t2);
        a1.addTrade(t3);

        assertEquals((1000*50.9)+(1000*70.5), a1.getTotalTrade());

    }
}