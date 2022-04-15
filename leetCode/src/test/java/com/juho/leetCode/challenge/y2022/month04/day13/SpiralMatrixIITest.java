package com.juho.leetCode.challenge.y2022.month04.day13;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SpiralMatrixIITest {

    SpiralMatrixII sm2 = new SpiralMatrixII();

    @Test
    public void spiralMatrixII01Test() {
        int n01 = 3;
        int[][] result01 = {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(result01, sm2.generateMatrix(n01));
    }
}