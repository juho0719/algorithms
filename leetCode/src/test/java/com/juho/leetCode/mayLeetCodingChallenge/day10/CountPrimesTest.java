package com.juho.leetCode.mayLeetCodingChallenge.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountPrimesTest {

    CountPrimes cp = new CountPrimes();

    @Test
    public void countPrimes01Test() {
        int n01 = 10;
        assertEquals(4, cp.countPrimes(n01));

        int n02 = 0;
        assertEquals(0, cp.countPrimes(n02));

        int n03 = 1;
        assertEquals(0, cp.countPrimes(n03));
    }
}