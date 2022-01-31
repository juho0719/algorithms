package com.juho.leetCode.challenge.y2022.month01.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RichestCustomerWealthTest {

    RichestCustomerWealth rcw = new RichestCustomerWealth();

    @Test
    public void richestCustomerWealth01Test() {
        int[][] accounts01 = {{1,2,3},{3,2,1}};
        assertEquals(6, rcw.maximumWealth(accounts01));
    }
}