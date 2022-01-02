package com.juho.leetCode.challenge.y2021.month10.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

    JumpGame jg = new JumpGame();

    @Test
    public void dungeonGame01Test() {
        int[] nums01 = {2,3,1,1,4};
        assertEquals(true, jg.canJump(nums01));

        int[] nums02 = {3,2,1,0,4};
        assertEquals(false, jg.canJump(nums02));
    }
}