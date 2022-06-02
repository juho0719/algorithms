package com.juho.leetCode.challenge.y2022.month06.day02;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class TransposeMatrixTest {

    TransposeMatrix tm = new TransposeMatrix();

    @Test
    public void transposeMatrix01Test() {
        int[][] matrix01 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result01 = {{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(result01, tm.transpose(matrix01));
    }
}