package com.juho.leetCode.challenge.month06.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinCostClimbingStairsTest {

    MinCostClimbingStairs mccs = new MinCostClimbingStairs();

    @Test
    public void minCostClimbingStairs01Test() {
        int[] cost01 = {10,15,20};
        assertEquals(15, mccs.minCostClimbingStairs(cost01));

        int[] cost02 = {1,100,1,1,1,100,1,1,100,1};
        assertEquals(6, mccs.minCostClimbingStairs(cost02));
    }

}
