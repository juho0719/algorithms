package com.juho.leetCode.challenge.y2021.month06.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxAreaOfIslandTest {

    MaxAreaOfIsland mai = new MaxAreaOfIsland();

    @Test
    public void maxAreaOfIsland01Test() {
        int[][] grid01 = {{0,0,1,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,1,1,0,1,0,0,0,0,0,0,0,0},
                            {0,1,0,0,1,1,0,0,1,0,1,0,0}, {0,1,0,0,1,1,0,0,1,1,1,0,0}, {0,0,0,0,0,0,0,0,0,0,1,0,0},
                            {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        assertEquals(6, mai.maxAreaOfIsland(grid01));
    }

}
