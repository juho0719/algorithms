package com.juho.leetCode.challenge.y2021.month09.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayNestingTest {

    ArrayNesting an = new ArrayNesting();

    @Test
    public void arrayNesting01Test() {
        int[] nums01 = {5,4,0,3,1,6,2};
        assertEquals(4, an.arrayNesting(nums01));

        int[] nums02 = {0,1,2};
        assertEquals(1, an.arrayNesting(nums02));
    }
}