package com.juho.leetCode.challenge.y2022.month03.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoCitySchedulingTest {

    TwoCityScheduling tcs = new TwoCityScheduling();

    @Test
    public void twoCityScheduling01Test() {
        int[][] costs01 = {{10,20},{30,200},{400,50},{30,20}};
        assertEquals(110, tcs.twoCitySchedCost(costs01));
    }
}