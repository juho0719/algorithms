package com.juho.leetCode.challenge.month10.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PerfectSquaresTest {

    PerfectSquares ps = new  PerfectSquares();

    @Test
    public void perfectSquares01Test() {
        int n01 = 12;
        assertEquals(3, ps.numSquares(n01));

        int n02 = 13;
        assertEquals(2, ps.numSquares(n02));
    }
}