package com.juho.leetCode.challenge.y2021.month04.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestIncreasingPathInaMatrixTest {

    LongestIncreasingPathInaMatrix lipm = new LongestIncreasingPathInaMatrix();

    @Test
    public void longestIncreasingPathInaMatrix01Test() {
        int[][] matrix01 = {{9,9,4}, {6,6,8}, {2,1,1}};
        assertEquals(4, lipm.longestIncreasingPath(matrix01));

        int[][] matrix02 = {{3,4,5}, {3,2,6}, {2,2,1}};
        assertEquals(4, lipm.longestIncreasingPath(matrix02));

        int[][] matrix03 = {{1}};
        assertEquals(1, lipm.longestIncreasingPath(matrix03));
    }
}
