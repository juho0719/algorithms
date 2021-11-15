package com.juho.leetCode.challenge.month11.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LargestDivisibleSubsetTest {

    LargestDivisibleSubset lds = new LargestDivisibleSubset();

    @Test
    public void iteratorForCombination01Test() {
        int[] nums01 = {1,2,3};
        List<Integer> result01 = new ArrayList<>();
        result01.add(2);
        result01.add(1);
        assertEquals(result01, lds.largestDivisibleSubset(nums01));

        int[] nums02 = {1,2,4,8};
        List<Integer> result02 = new ArrayList<>();
        result02.add(8);
        result02.add(4);
        result02.add(2);
        result02.add(1);
        assertEquals(result02, lds.largestDivisibleSubset(nums02));
    }
}