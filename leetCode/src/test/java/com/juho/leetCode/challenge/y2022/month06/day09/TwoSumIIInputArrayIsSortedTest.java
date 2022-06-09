package com.juho.leetCode.challenge.y2022.month06.day09;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TwoSumIIInputArrayIsSortedTest {

    TwoSumIIInputArrayIsSorted ts2 = new TwoSumIIInputArrayIsSorted();

    @Test
    public void twoSumIIInputArrayIsSorted01Test() {
        int[] nums01 = {2,7,11,15};
        int target01 = 9;
        int[] result01 = {1,2};
        assertArrayEquals(result01, ts2.twoSum(nums01, target01));        
    }
}