package com.juho.leetCode.decemberLeetCodingChallenge.day11;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {

    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @Test
    public void mergeSortedArray01Test() {
        int[] nums01 = {1,2,3,0,0,0};
        int m1 = 3;
        int[] nums02 = {2,5,6};
        int n1 = 3;
        int[] result = {1,2,2,3,5,6};
        
        mergeSortedArray.merge(nums01, m1, nums02, n1);

        assertArrayEquals(nums01, result);
    }
}