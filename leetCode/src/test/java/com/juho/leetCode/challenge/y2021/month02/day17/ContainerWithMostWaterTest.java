package com.juho.leetCode.challenge.y2021.month02.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {
    
    ContainerWithMostWater cwmw = new ContainerWithMostWater();

    @Test
    public void containerWithMostWater01Test() {
        int[] height01 = {1,8,6,2,5,4,8,3,7};
        assertEquals(cwmw.maxArea(height01), 49);

        int[] height02 = {1,1};
        assertEquals(cwmw.maxArea(height02), 1);

        int[] height03 = {4,3,2,1,4};
        assertEquals(cwmw.maxArea(height03), 16);

        int[] height04 = {1,2,1};
        assertEquals(cwmw.maxArea(height04), 2);
    }
}
