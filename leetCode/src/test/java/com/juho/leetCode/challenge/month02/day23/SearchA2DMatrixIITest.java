package com.juho.leetCode.challenge.month02.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixIITest {
    
    SearchA2DMatrixII smii = new SearchA2DMatrixII();

    @Test
    public void searchA2DMatrixII01Test() {
        int[][] matrix01 = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        assertEquals(smii.searchMatrix(matrix01, 5), true);

        int[][] matrix02 = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        assertEquals(smii.searchMatrix(matrix02, 20), false);
    }
}
