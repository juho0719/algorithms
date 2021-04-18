package com.juho.leetCode.aprilLeetCodingChallenge.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberOfSubmatricesThatSumToTargetTest {

    NumberOfSubmatricesThatSumToTarget nstst = new NumberOfSubmatricesThatSumToTarget();

    @Test
    public void numberOfSubmatricesThatSumToTarget01Test() {
        int[][] matrix01 = {{0,1,0}, {1,1,1}, {0,1,0}};
        int target01 = 0;
        assertEquals(4, nstst.numSubmatrixSumTarget(matrix01, target01));

        int[][] matrix02 = {{1,-1}, {-1,1}};
        int target02 = 0;
        assertEquals(5, nstst.numSubmatrixSumTarget(matrix02, target02));

        int[][] matrix03 = {{904}};
        int target03 = 0;
        assertEquals(0, nstst.numSubmatrixSumTarget(matrix03, target03));
    }
}
