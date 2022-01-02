package com.juho.leetCode.challenge.month12.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumProductSubarrayTest {

    MaximumProductSubarray mps = new MaximumProductSubarray();

    @Test
    public void maximumProductSubarray01Test() {
        int[] nums01 = {2,3,-2,4};
        assertEquals(6, mps.maxProduct(nums01));

        int[] nums02 = {-2,0,-1};
        assertEquals(0, mps.maxProduct(nums02));
    }
}