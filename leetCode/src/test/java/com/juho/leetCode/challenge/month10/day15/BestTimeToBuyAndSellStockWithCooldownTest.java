package com.juho.leetCode.challenge.month10.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockWithCooldownTest {

    BestTimeToBuyAndSellStockWithCooldown btbsc = new  BestTimeToBuyAndSellStockWithCooldown();

    @Test
    public void bestTimeToBuyAndSellStockWithCooldown01Test() {
        int[] prices01 = {1,2,3,0,2};
        assertEquals(3, btbsc.maxProfit(prices01));

        int[] prices02 = {1};
        assertEquals(0, btbsc.maxProfit(prices02));
    }
}