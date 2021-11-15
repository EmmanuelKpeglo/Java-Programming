package com.company;

import junit.framework.TestCase;

public class BondTradeTest extends TestCase {

    public void testCalcDividend() {
        BondTrade bondTrade = new BondTrade("BT", "WIN", 9, 3.0, 6.0);
        assertEquals(6.0, bondTrade.calcDividend());
    }
}