package com.juho.leetCode.challenge.month10.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RottingOrangesTest {

    RottingOranges ro = new RottingOranges();

    @Test
    public void rottingOranges01Test() {
        int[][] grid01 = {{2,1,1},{1,1,0},{0,1,1}};
        assertEquals(4, ro.orangesRotting(grid01));

        int[][] grid02 = {{2,1,1},{0,1,1},{1,0,1}};
        assertEquals(-1, ro.orangesRotting(grid02));

        int[][] grid03 = {{0,2}};
        assertEquals(0, ro.orangesRotting(grid03));
    }
}