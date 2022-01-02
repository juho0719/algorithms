package com.juho.leetCode.challenge.month07.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumLengthOfRepeatedSubarrayTest {

    MaximumLengthOfRepeatedSubarray mlrs = new MaximumLengthOfRepeatedSubarray();

    @Test
    public void maximumLengthOfRepeatedSubarray01Test() {
        int[] nums01 = {1,2,3,2,1};
        int[] nums02 = {3,2,1,4,7};
        assertEquals(3, mlrs.findLength(nums01, nums02));

        int[] nums11 = {0,0,0,0,0};
        int[] nums12 = {0,0,0,0,0};
        assertEquals(5, mlrs.findLength(nums11, nums12));
    }

}
