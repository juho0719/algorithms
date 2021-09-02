package com.juho.leetCode.challenge.month08.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray fmrsa = new FindMinimumInRotatedSortedArray();

    @Test
    public void findMinimumInRotatedSortedArray01Test() {
        int[] nums01 = {3,4,5,1,2};
        assertEquals(1, fmrsa.findMin(nums01));

        int[] nums02 = {4,5,6,7,0,1,2};
        assertEquals(0, fmrsa.findMin(nums02));

        int[] nums03 = {11,13,15,17};
        assertEquals(11, fmrsa.findMin(nums03));
    }
}