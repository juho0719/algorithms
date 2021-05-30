package com.juho.leetCode.mayLeetCodingChallenge.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaximumGapTest {
    
    MaximumGap mg = new MaximumGap();

    @Test
    public void maximumGap01Test() {
        int[] nums01 = {3,6,9,1};
        assertEquals(3, mg.totalNQueens(nums01));

        int[] nums02 = {10};
        assertEquals(0, mg.totalNQueens(nums02));
    }
}