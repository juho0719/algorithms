package com.juho.leetCode.challenge.y2021.month07.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ReshapeTheMatrixTest {

    ReshapeTheMatrix rm = new ReshapeTheMatrix();

    @Test
    public void reshapeTheMatrix01Test() {
        int[][] mat01 = {{1,2},{3,4}};
        int r01 = 1;
        int c01 = 4;
        int[][] result01 = {{1,2,3,4}};
        assertArrayEquals(result01, rm.matrixReshape(mat01, r01, c01));

        int[][] mat02 = {{1,2},{3,4}};
        int r02 = 2;
        int c02 = 4;
        int[][] result02 = {{1,2},{3,4}};
        assertArrayEquals(result02, rm.matrixReshape(mat02, r02, c02));
    }

}
