package com.juho.leetCode.challenge.month06.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SwimInRisingWaterTest {

    SwimInRisingWater srw = new SwimInRisingWater();

    @Test
    public void swimInRisingWater01Test() {
        int[][] grid01 = {{0,2},{1,3}};
        assertEquals(3, srw.swimInWater(grid01));

        int[][] grid02 = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        assertEquals(16, srw.swimInWater(grid02));
    }

}
