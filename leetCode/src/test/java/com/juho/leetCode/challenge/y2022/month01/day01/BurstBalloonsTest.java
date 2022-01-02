package com.juho.leetCode.challenge.y2022.month01.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BurstBalloonsTest {

    BurstBalloons bb = new BurstBalloons();
    
    @Test
    public void burstBalloons01Test() {
        int[] nums01 = {3,1,5,8};
        assertEquals(167, bb.rob(nums01));

        int[] nums02 = {1,5};
        assertEquals(10, bb.rob(nums02));
    }
}