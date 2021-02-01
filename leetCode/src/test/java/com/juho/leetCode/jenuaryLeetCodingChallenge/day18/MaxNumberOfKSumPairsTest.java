package com.juho.leetCode.jenuaryLeetCodingChallenge.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.jenuaryLeetCodingChallenge.day18.MaxNumberOfKSumPairs;

import org.junit.jupiter.api.Test;

public class MaxNumberOfKSumPairsTest {

    MaxNumberOfKSumPairs mnoksp = new MaxNumberOfKSumPairs();

    @Test
    public void countSortedVowelStrings01Test() {
        int[] nums01 = {1,2,3,4};
        int k01 = 5;
        assertEquals(mnoksp.maxOperations(nums01, k01), 2);

        int[] nums02 = {3,1,3,4,3};
        int k02 = 6;
        assertEquals(mnoksp.maxOperations(nums02, k02), 1);
    }
}