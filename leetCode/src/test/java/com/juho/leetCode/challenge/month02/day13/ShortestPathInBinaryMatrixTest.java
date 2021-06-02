package com.juho.leetCode.challenge.month02.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShortestPathInBinaryMatrixTest {
    
    ShortestPathInBinaryMatrix spbm = new ShortestPathInBinaryMatrix();

    @Test
    public void shortestPathInBinaryMatrix01Test() {
        int[][] grid01 = new int[][]{{0,1}, {1,0}};
        int result01 = 2;
        assertEquals(spbm.shortestPathBinaryMatrix(grid01), result01);

        int[][] grid02 = new int[][]{{0,0,0}, {1,1,0}, {1,1,0}};
        int result02 = 4;
        assertEquals(spbm.shortestPathBinaryMatrix(grid02), result02);
    }
}
