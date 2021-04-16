package com.juho.leetCode.aprilLeetCodingChallenge.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FibonacciNumbersTest {

    FibonacciNumbers fn = new FibonacciNumbers();

    @Test
    public void partitionList01Test() {
        int n01 = 2;
        assertEquals(1, fn.fib(n01));

        int n02 = 3;
        assertEquals(2, fn.fib(n02));

        int n03 = 4;
        assertEquals(3, fn.fib(n03));
    }
}
