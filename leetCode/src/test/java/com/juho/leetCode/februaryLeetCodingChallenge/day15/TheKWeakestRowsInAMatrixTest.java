package com.juho.leetCode.februaryLeetCodingChallenge.day15;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TheKWeakestRowsInAMatrixTest {
    
    TheKWeakestRowsInAMatrix tkwrm = new TheKWeakestRowsInAMatrix();

    @Test
    public void theKWeakestRowsInAMatrix01Test() {
        int[][] mat01 = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k01 = 3;
        int[] result01 = {2,0,3};
        assertArrayEquals(tkwrm.kWeakestRows(mat01, k01), result01);

        int[][] mat02 = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0}
        };
        int k02 = 2;
        int[] result02 = {0,2};
        assertArrayEquals(tkwrm.kWeakestRows(mat02, k02), result02);
    }
}
