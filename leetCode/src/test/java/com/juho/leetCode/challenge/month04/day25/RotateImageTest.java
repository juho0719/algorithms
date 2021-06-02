package com.juho.leetCode.challenge.month04.day25;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RotateImageTest {

    RotateImage ri = new RotateImage();

    @Test
    public void rotateImage01Test() {
        int[][] matrix01 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        int[][] result01 = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
        ri.rotate(matrix01);
        assertArrayEquals(result01, matrix01);

        int[][] matrix02 = { { 1 } };
        int[][] result02 = { { 1 } };
        ri.rotate(matrix02);
        assertArrayEquals(result02, matrix02);

        int[][] matrix03 = { { 1, 2 }, { 3, 4 } };
        int[][] result03 = { { 3, 1 }, { 4, 2 } };
        ri.rotate(matrix03);
        assertArrayEquals(result03, matrix03);
    }

}
