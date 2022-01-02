package com.juho.leetCode.challenge.month09.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargestPlusSignTest {

    LargestPlusSign lps = new LargestPlusSign();

    @Test
    public void largestPlusSign01Test() {
        int n01 = 5;
        int[][] mines01 = {{4,2}};
        assertEquals(2, lps.orderOfLargestPlusSign(n01, mines01));

        int n02 = 1;
        int[][] mines02 = {{0,0}};
        assertEquals(0, lps.orderOfLargestPlusSign(n02, mines02));
    }
}