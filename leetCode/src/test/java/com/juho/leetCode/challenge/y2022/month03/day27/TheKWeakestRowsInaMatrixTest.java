package com.juho.leetCode.challenge.y2022.month03.day27;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TheKWeakestRowsInaMatrixTest {

    TheKWeakestRowsInaMatrix kwrm = new TheKWeakestRowsInaMatrix();

    @Test
    public void theKWeakestRowsInaMatrix01Test() {
        int[][] mat01 = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k01 = 2;
        int[] result01 = {0,2};
        assertArrayEquals(result01, kwrm.kWeakestRows(mat01, k01));
    }
}