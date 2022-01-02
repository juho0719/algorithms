package com.juho.leetCode.challenge.month06.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {

    MaxConsecutiveOnesIII mco3 = new MaxConsecutiveOnesIII();

    @Test
    public void maxConsecutiveOnesIII01Test() {
        int[] nums01 = {1,1,1,0,0,0,1,1,1,1,0};
        int k01 = 2;
        assertEquals(6, mco3.longestOnes(nums01, k01));

        int[] nums02 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k02 = 3;
        assertEquals(10, mco3.longestOnes(nums02, k02));
    }

}
