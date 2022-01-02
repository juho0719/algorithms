package com.juho.leetCode.challenge.y2021.month10.day19;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class NextGreaterElementITest {

    NextGreaterElementI nge1 = new  NextGreaterElementI();

    @Test
    public void nextGreaterElementI01Test() {
        int[] nums101 = {4,1,2};
        int[] nums102 = {1,3,4,2};
        int[] result01 = {-1,3,-1};
        assertArrayEquals(result01, nge1.nextGreaterElement(nums101, nums102));

        int[] nums201 = {2,4};
        int[] nums202 = {1,2,3,4};
        int[] result02 = {3,-1};
        assertArrayEquals(result02, nge1.nextGreaterElement(nums201, nums202));
    }
}