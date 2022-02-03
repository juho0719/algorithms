package com.juho.leetCode.challenge.y2022.month02.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FourSumIITest {

    FourSumII fs2 = new FourSumII();

    @Test
    public void fourSumII01Test() {
        int[] nums101 = {1,2};
        int[] nums102 = {-2,-1};
        int[] nums103 = {-1,2};
        int[] nums104 = {0,2};
        assertEquals(2, fs2.fourSumCount(nums101, nums102, nums103, nums104));
    }
}