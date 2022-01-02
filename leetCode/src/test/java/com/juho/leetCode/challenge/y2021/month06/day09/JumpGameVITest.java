package com.juho.leetCode.challenge.y2021.month06.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JumpGameVITest {

    JumpGameVI jg6 = new JumpGameVI();

    @Test
    public void jumpGameVI01Test() {
        int[] nums01 = {1,-1,-2,4,-7,3};
        int k01 = 2;
        assertEquals(7, jg6.maxResult(nums01, k01));

        int[] nums02 = {10,-5,-2,4,0,3};
        int k02 = 3;
        assertEquals(17, jg6.maxResult(nums02, k02));

        int[] nums03 = {1,-5,-20,4,-1,3,-6,-3};
        int k03 = 2;
        assertEquals(0, jg6.maxResult(nums03, k03));
    }

}
