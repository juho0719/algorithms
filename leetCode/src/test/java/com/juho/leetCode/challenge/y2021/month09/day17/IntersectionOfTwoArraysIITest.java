package com.juho.leetCode.challenge.y2021.month09.day17;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class IntersectionOfTwoArraysIITest {

    IntersectionOfTwoArraysII sm = new IntersectionOfTwoArraysII();

    @Test
    public void intersectionOfTwoArraysII01Test() {
        int[] nums101 = {1,2,2,1};
        int[] nums102 = {2,2};
        int[] result100 = {2,2};
        assertArrayEquals(result100, sm.intersect(nums101, nums102));
    }
}