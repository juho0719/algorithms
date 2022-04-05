package com.juho.leetCode.challenge.y2022.month04.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContainerWithMostWaterTest {

    ContainerWithMostWater cwm = new ContainerWithMostWater();

    @Test
    public void containerWithMostWater01Test() {
        int[] height01 = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, cwm.maxArea(height01));
    }
}