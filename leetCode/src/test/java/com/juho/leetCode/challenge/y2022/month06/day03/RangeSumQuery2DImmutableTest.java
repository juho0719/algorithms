package com.juho.leetCode.challenge.y2022.month06.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RangeSumQuery2DImmutableTest {

    @Test
    public void rangeSumQuery2DImmutable01Test() {
        int[][] matrix01 = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        RangeSumQuery2DImmutable rsqi = new RangeSumQuery2DImmutable(matrix01);
        assertEquals(8, rsqi.sumRegion(2, 1, 4, 3));
        assertEquals(11, rsqi.sumRegion(1, 1, 2, 2));
        assertEquals(12, rsqi.sumRegion(1, 2, 2, 4));
    }
}