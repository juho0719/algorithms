package com.juho.leetCode.challenge.y2022.month06.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumOperationsToReduceXToZeroTest {

    MinimumOperationsToReduceXToZero morz = new MinimumOperationsToReduceXToZero();

    @Test
    public void minimumOperationsToReduceXToZero01Test() {
        int[] nums01 = {1,1,4,2,3};
        int x01= 5;
        assertEquals(2, morz.minOperations(nums01, x01));
    }
}