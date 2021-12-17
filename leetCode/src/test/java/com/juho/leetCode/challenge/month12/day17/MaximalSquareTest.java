package com.juho.leetCode.challenge.month12.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximalSquareTest {

    MaximalSquare ms = new MaximalSquare();

    @Test
    public void maximalSquare01Test() {
        char[][] matrix01 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        assertEquals(4, ms.maximalSquare(matrix01));

        char[][] matrix02 = {{'0','1'},{'1','0'}};
        assertEquals(1, ms.maximalSquare(matrix02));
        
        char[][] matrix03 = {{'0'}};
        assertEquals(0, ms.maximalSquare(matrix03));
    }
}