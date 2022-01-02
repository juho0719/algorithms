package com.juho.leetCode.challenge.y2021.month08.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    TwoSum ts = new TwoSum();

    @Test
    public void twoSum01Test() {
        int[] nums01 = {2,7,11,15};
        int target01 = 9;
        int[] result01 = {0,1};
        assertArrayEquals(result01, ts.twoSum(nums01, target01));

        int[] nums02 = {3,2,4};
        int target02 = 6;
        int[] result02 = {1,2};
        assertArrayEquals(result02, ts.twoSum(nums02, target02));

        int[] nums03 = {3,3};
        int target03 = 6;
        int[] result03 = {0,1};
        assertArrayEquals(result03, ts.twoSum(nums03, target03));
    }
}
