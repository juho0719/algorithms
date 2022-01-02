package com.juho.leetCode.challenge.month09.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();

    @Test
    public void maxConsecutiveOnes01Test() {
        int[] nums01 = {1,1,0,1,1,1};
        assertEquals(3, mco.findMaxConsecutiveOnes(nums01));

        int[] nums02 = {1,0,1,1,0,1};
        assertEquals(2, mco.findMaxConsecutiveOnes(nums02));
    }
}