package com.juho.leetCode.challenge.y2021.month08.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MakingALargeIslandTest {

    MakingALargeIsland mli = new MakingALargeIsland();

    @Test
    public void makingALargeIsland01Test() {
        int[][] grid01 = {{1,0},{0,1}};
        assertEquals(3, mli.largestIsland(grid01));

        int[][] grid02 = {{1,1},{1,0}};
        assertEquals(4, mli.largestIsland(grid02));

        int[][] grid03 = {{1,1},{1,1}};
        assertEquals(4, mli.largestIsland(grid03));
    }
}
