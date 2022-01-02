package com.juho.leetCode.challenge.y2021.month11.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIITest {

    BestTimeToBuyAndSellStockII btbss2 = new BestTimeToBuyAndSellStockII();

    @Test
    public void bestTimeToBuyAndSellStockII01Test() {
        int[] prices01 = {7,1,5,3,6,4};
        assertEquals(7, btbss2.maxProfit(prices01));

        int[] prices02 = {1,2,3,4,5};
        assertEquals(4, btbss2.maxProfit(prices02));

        int[] prices03 = {7,6,4,3,1};
        assertEquals(0, btbss2.maxProfit(prices03));
    }
}