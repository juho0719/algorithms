package com.juho.leetCode.challenge.y2021.month07.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxSumOfRectangleNoLargerThanKTest {

    MaxSumOfRectangleNoLargerThanK msrnlt = new MaxSumOfRectangleNoLargerThanK();

    @Test
    public void maxSumOfRectangleNoLargerThanK01Test() {
        int[][] matrix01 = {{1,0,1},{0,-2,3}};
        int k01 = 2;
        assertEquals(2, msrnlt.maxSumSubmatrix(matrix01, k01));

        int[][] matrix02 = {{2,2,-1}};
        int k02 = 3;
        assertEquals(3, msrnlt.maxSumSubmatrix(matrix02, k02));
    }

}
