package com.company;

import junit.framework.TestCase;

public class TraderTest extends TestCase {

    public void testAddTrade() {
        Trader a1 = new Trader("Zedikus", new Account());
//        Trade t2 = new Trade("1", "AAPL", 1000, 50.9);
//        Trade t3 = new Trade("2", "IBM", 1000, 70.5);

//        a1.addTrade(t2);
//        a1.addTrade(t3);

        assertEquals((1000*50.9)+(1000*70.5), a1.retrieveTotalTrade());
    }

}
