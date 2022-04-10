package com.juho.leetCode.challenge.y2022.month04.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LastStoneWeightTest {

    LastStoneWeight lsw = new LastStoneWeight();

    @Test
    public void lastStoneWeight01Test() {
        int[] stones01 = {2,7,4,1,8,1};
        assertEquals(1, lsw.lastStoneWeight(stones01));
    }
}