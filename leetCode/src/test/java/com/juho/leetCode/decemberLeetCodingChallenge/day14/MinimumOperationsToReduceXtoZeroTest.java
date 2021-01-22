package com.juho.leetCode.decemberLeetCodingChallenge.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumOperationsToReduceXtoZeroTest {

    MinimumOperationsToReduceXtoZero motrxz = new MinimumOperationsToReduceXtoZero();

    @Test
    public void minimumOperationsToReduceXtoZero01Test() {
        int[] nums01 = {1,1,4,2,3};
        int x01 = 5;
        assertEquals(motrxz.minOperations(nums01, x01), 2);

        int[] nums02 = {5,6,7,8,9};
        int x02 = 4;
        assertEquals(motrxz.minOperations(nums02, x02), -1);

        int[] nums03 = {3,2,20,1,1,3};
        int x03 = 10;
        assertEquals(motrxz.minOperations(nums03, x03), 5);
    }
}