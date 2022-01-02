package com.juho.leetCode.challenge.month07.day29;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ZeroOneMatrixTest {
    
    ZeroOneMatrix zom = new ZeroOneMatrix();

    @Test
    public void zeroOneMatrix01Test() {
        int[][] mat01 = {{0,0,0}, {0,1,0}, {0,0,0}};
        int[][] result01 = {{0,0,0}, {0,1,0}, {0,0,0}};
        assertArrayEquals(result01, zom.updateMatrix(mat01));
    }
}
