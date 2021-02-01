package com.juho.leetCode.jenuaryLeetCodingChallenge.day23;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SortTheMatrixDiagonallyTest {

    SortTheMatrixDiagonally stmd = new SortTheMatrixDiagonally();

    @Test
    public void determineIfTwoStringsAreClose01Test() {
        int[][] mat01 = {{3,3,1,1}, {2,2,1,2}, {1,1,1,2}};
        int[][] result01 = {{1,1,1,1}, {1,2,2,2}, {1,2,3,3}};
        assertArrayEquals(stmd.diagonalSort(mat01), result01);
    }
}