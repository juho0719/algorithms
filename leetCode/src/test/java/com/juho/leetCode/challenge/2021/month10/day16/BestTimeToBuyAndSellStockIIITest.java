package com.juho.leetCode.challenge.month10.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIIITest {

    BestTimeToBuyAndSellStockIII btbss3 = new  BestTimeToBuyAndSellStockIII();

    @Test
    public void bestTimeToBuyAndSellStockIII01Test() {
        int[] prices01 = {3,3,5,0,0,3,1,4};
        assertEquals(6, btbss3.maxProfit(prices01));

        int[] prices02 = {1,2,3,4,5};
        assertEquals(4, btbss3.maxProfit(prices02));

        int[] prices03 = {7,6,4,3,1};
        assertEquals(0, btbss3.maxProfit(prices03));
    }
}