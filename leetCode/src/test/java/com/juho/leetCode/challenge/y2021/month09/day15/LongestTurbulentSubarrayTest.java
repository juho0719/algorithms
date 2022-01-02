package com.juho.leetCode.challenge.y2021.month09.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestTurbulentSubarrayTest {

    LongestTurbulentSubarray lts = new LongestTurbulentSubarray();

    @Test
    public void longestTurbulentSubarray01Test() {
        int[] arr01 = {9,4,2,10,7,8,8,1,9};
        assertEquals(5, lts.maxTurbulenceSize(arr01));

        int[] arr02 = {4,8,12,16};
        assertEquals(2, lts.maxTurbulenceSize(arr02));

        int[] arr03 = {100};
        assertEquals(1, lts.maxTurbulenceSize(arr03));
    }
}