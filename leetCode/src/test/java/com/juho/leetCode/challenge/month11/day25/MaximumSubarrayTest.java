package com.juho.leetCode.challenge.month11.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    MaximumSubarray ms = new MaximumSubarray();

    @Test
    public void maximumSubarray01Test() {
        int[] nums01 = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, ms.maxSubArray(nums01));

        int[] nums02 = {1};
        assertEquals(1, ms.maxSubArray(nums02));

        int[] nums03 = {5,4,-1,7,8};
        assertEquals(23, ms.maxSubArray(nums03));
    }
}