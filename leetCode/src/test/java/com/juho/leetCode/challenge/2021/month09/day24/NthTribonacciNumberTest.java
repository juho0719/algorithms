package com.juho.leetCode.challenge.month09.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NthTribonacciNumberTest {

    NthTribonacciNumber ntbn = new NthTribonacciNumber();

    @Test
    public void nthTribonacciNumber01Test() {
        int n01 = 4;
        assertEquals(4, ntbn.tribonacci(n01));

        int n02 = 25;
        assertEquals(1389537, ntbn.tribonacci(n02));
    }
}