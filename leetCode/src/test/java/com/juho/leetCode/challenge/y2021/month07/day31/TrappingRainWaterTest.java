package com.juho.leetCode.challenge.y2021.month07.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TrappingRainWaterTest {

    TrappingRainWater trw = new TrappingRainWater();

    @Test
    public void trappingRainWater01Test() {
        int[] height01 = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, trw.trap(height01));

        int[] height02 = {4,2,0,3,2,5};
        assertEquals(9, trw.trap(height02));
    }
}
