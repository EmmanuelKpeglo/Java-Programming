package com.company;

import junit.framework.TestCase;

public class FundTradeTest extends TestCase {

    public void testCalcDividend() {
        FundTrade bondTrade = new FundTrade("FT", "DOR", 9, 3.0, 6.0);
        assertEquals(0.18, bondTrade.calcDividend());
    }
}