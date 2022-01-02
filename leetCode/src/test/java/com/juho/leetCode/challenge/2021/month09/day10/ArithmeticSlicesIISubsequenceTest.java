package com.juho.leetCode.challenge.month09.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArithmeticSlicesIISubsequenceTest {

    ArithmeticSlicesIISubsequence as2s = new ArithmeticSlicesIISubsequence();

    @Test
    public void arithmeticSlicesIISubsequence01Test() {
        int[] nums01 = {2,4,6,8,10};
        assertEquals(7, as2s.numberOfArithmeticSlices(nums01));

        int[] nums02 = {7,7,7,7,7};
        assertEquals(16, as2s.numberOfArithmeticSlices(nums02));
    }
}