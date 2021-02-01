package com.juho.leetCode.jenuaryLeetCodingChallenge.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.jenuaryLeetCodingChallenge.day30.MinimizeDeviationInArray;

import org.junit.jupiter.api.Test;

public class MinimizeDeviationInArrayTest {

    MinimizeDeviationInArray mdia = new MinimizeDeviationInArray();

    @Test
    public void minimizeDeviationInArray01Test() {
        int[] nums01 = {1,2,3,4};
        assertEquals(mdia.minimumDeviation(nums01), 1);

        int[] nums02 = {4,1,5,20,3};
        assertEquals(mdia.minimumDeviation(nums02), 3);

        int[] nums03 = {2,10,8};
        assertEquals(mdia.minimumDeviation(nums03), 3);
    }
}