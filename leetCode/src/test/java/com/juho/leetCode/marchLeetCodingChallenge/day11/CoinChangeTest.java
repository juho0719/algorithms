package com.juho.leetCode.marchLeetCodingChallenge.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {
    
    CoinChange cc = new CoinChange();

    @Test
    public void coinChange01Test() {
        int[] coins01 = {1,2,5};
        int amount01 = 11;
        assertEquals(cc.coinChange(coins01, amount01), 3);
        
        int[] coins02 = {2};
        int amount02 = 3;
        assertEquals(cc.coinChange(coins02, amount02), -1);

        int[] coins03 = {1};
        int amount03 = 0;
        assertEquals(cc.coinChange(coins03, amount03), 0);

        int[] coins04 = {1};
        int amount04 = 1;
        assertEquals(cc.coinChange(coins04, amount04), 1);

        int[] coins05 = {1};
        int amount05 = 2;
        assertEquals(cc.coinChange(coins05, amount05), 2);
    }
}
