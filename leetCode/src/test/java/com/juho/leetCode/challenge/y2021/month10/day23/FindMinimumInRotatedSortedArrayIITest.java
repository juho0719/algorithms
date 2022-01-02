package com.juho.leetCode.challenge.y2021.month10.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindMinimumInRotatedSortedArrayIITest {

    FindMinimumInRotatedSortedArrayII fmrsa2 = new FindMinimumInRotatedSortedArrayII();

    @Test
    public void findMinimumInRotatedSortedArrayII01Test() {
        int[] nums01 = {1,3,5};
        assertEquals(1, fmrsa2.findMin(nums01));

        int[] nums02 = {2,2,2,0,1};
        assertEquals(0, fmrsa2.findMin(nums02));
    }
}