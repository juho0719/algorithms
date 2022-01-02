package com.juho.leetCode.challenge.y2021.month10.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClimbStairsTest {

    ClimbStairs ip = new ClimbStairs();

    @Test
    public void climbStairs01Test() {
        int n01 = 2;
        assertEquals(2, ip.climbStairs(n01));

        int n02 = 3;
        assertEquals(3, ip.climbStairs(n02));
    }
}