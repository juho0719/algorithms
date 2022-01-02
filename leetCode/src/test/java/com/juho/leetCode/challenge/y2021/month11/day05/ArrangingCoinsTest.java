package com.juho.leetCode.challenge.y2021.month11.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrangingCoinsTest {

    ArrangingCoins ac = new ArrangingCoins();

    @Test
    public void arrangingCoins01Test() {
        int n01 = 5;
        assertEquals(2, ac.arrangeCoins(n01));

        int n02 = 8;
        assertEquals(3, ac.arrangeCoins(n02));
    }
}