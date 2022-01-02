package com.juho.leetCode.challenge.y2021.month08.day13;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SetMatrixZeroesTest {

    SetMatrixZeroes smz = new SetMatrixZeroes();

    @Test
    public void setMatrixZeroes01Test() {
        int[][] matrix01 = {{1,1,1}, {1,0,1}, {1,1,1}};
        int[][] result01 = {{1,0,1}, {0,0,0}, {1,0,1}};
        smz.setZeroes(matrix01);
        assertArrayEquals(result01, matrix01);
    }
}
