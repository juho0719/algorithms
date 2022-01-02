package com.juho.leetCode.challenge.y2021.month03.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockWithTransactionFeeTest {
    
    BestTimeToBuyAndSellStockWithTransactionFee btbsstf = new BestTimeToBuyAndSellStockWithTransactionFee();

    @Test
    public void bestTimeToBuyAndSellStockWithTransactionFee01Test() {
        int[] prices01 = {1,3,2,8,4,9};
        int fee01 = 2;
        assertEquals(btbsstf.maxProfit(prices01, fee01), 8);

        int[] prices02 = {1,3,7,5,10,3};
        int fee02 = 3;
        assertEquals(btbsstf.maxProfit(prices02, fee02), 6);
    }
}
