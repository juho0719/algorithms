package com.juho.leetCode.decemberLeetCodingChallenge.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckArrayFormationThroughConcatenationTest {

    @Test
    public void checkArrayFormationThroughConcatenation01Test() {
        int[] arr = {91,4,64,78};
        int[][] pieces = {{78}, {4,64}, {91}};

        assertEquals(canFormArrayV2(arr, pieces), true);

        int[] arr2 = {1,3,5,7};
        int[][] pieces2 = {{2,4,6,8}};

        assertEquals(canFormArrayV2(arr2, pieces2), false);

        int[] arr3 = {15,88};
        int[][] pieces3 = {{88},{15}};

        assertEquals(canFormArrayV2(arr3, pieces3), true);

        int[] arr4 = {49,18,16};
        int[][] pieces4 = {{16,18,49}};

        assertEquals(canFormArrayV2(arr4, pieces4), false);
    }
}