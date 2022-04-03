package com.juho.leetCode.challenge.y2022.month03.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SearchA2DMatrixTest {

    SearchA2DMatrix s2m = new SearchA2DMatrix();

    @Test
    public void searchA2DMatrix01Test() {
        int[][] matrix01 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target01 = 3;
        assertEquals(true, s2m.searchMatrix(matrix01, target01));
    }
}