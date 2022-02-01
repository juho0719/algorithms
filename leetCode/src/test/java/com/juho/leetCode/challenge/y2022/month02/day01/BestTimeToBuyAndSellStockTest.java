package com.juho.leetCode.challenge.y2022.month02.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock bts = new BestTimeToBuyAndSellStock();

    @Test
    public void bestTimeToBuyAndSellStock01Test() {
        int[] prices01 = {7,1,5,3,6,4};
        assertEquals(5, bts.maxProfit(prices01));

        int[] prices02 = {7,6,4,3,1};
        assertEquals(0, bts.maxProfit(prices02));
    }
}