package com.company;

import junit.framework.TestCase;

public class TradeTest extends TestCase {


    public void testSetPrice() {
        Trade myTrade = new Trade("1", "AAPL", 1000, -50.9);
        assertEquals(0.0, myTrade.getPrice());
    }

    public void testTestToString() {
    }
}

