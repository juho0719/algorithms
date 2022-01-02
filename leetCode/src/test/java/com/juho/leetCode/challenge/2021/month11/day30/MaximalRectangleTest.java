package com.juho.leetCode.challenge.month11.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximalRectangleTest {

    MaximalRectangle mr = new MaximalRectangle();

    @Test
    public void maximalRectangle01Test() {
        char[][] matrix01 = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        assertEquals(6, mr.maximalRectangle(matrix01));

        char[][] matrix02 = {};
        assertEquals(0, mr.maximalRectangle(matrix02));

        char[][] matrix03 = {{'1'}};
        assertEquals(1, mr.maximalRectangle(matrix03));

        char[][] matrix04 = {{'0','0'}};
        assertEquals(0, mr.maximalRectangle(matrix04));
    }
}