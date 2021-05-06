package com.juho.leetCode.mayLeetCodingChallenge.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpGame2Test {

    JumpGame2 jg2 = new JumpGame2();

    @Test
    public void jumpGame201Test() {
        int[] nums01 = {2,3,1,1,4};
        assertEquals(2, jg2.jump(nums01));

        int[] nums02 = {2,3,0,1,4};
        assertEquals(2, jg2.jump(nums02));
    }

}
