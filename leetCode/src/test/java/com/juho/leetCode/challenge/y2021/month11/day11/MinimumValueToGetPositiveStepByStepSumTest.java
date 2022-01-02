package com.juho.leetCode.challenge.y2021.month11.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumValueToGetPositiveStepByStepSumTest {

    MinimumValueToGetPositiveStepByStepSum mvgps = new MinimumValueToGetPositiveStepByStepSum();

    @Test
    public void minimumValueToGetPositiveStepByStepSum01Test() {
        int[] nums01 = {-3,2,-3,4,2};
        assertEquals(5, mvgps.minStartValue(nums01));

        int[] nums02 = {1,2};
        assertEquals(1, mvgps.minStartValue(nums02));

        int[] nums03 = {1,-2,-3};
        assertEquals(5, mvgps.minStartValue(nums03));
    }
}