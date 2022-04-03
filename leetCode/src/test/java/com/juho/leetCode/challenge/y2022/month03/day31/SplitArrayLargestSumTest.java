package com.juho.leetCode.challenge.y2022.month03.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SplitArrayLargestSumTest {

    SplitArrayLargestSum sals = new SplitArrayLargestSum();

    @Test
    public void splitArrayLargestSum01Test() {
        int[] nums01 = {7,2,5,10,8};
        int m01 = 2;
        assertEquals(18, sals.splitArray(nums01, m01));
    }
}