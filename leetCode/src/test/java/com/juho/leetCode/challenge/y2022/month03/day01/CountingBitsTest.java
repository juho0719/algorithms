package com.juho.leetCode.challenge.y2022.month03.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class CountingBitsTest {

    CountingBits sr = new CountingBits();

    @Test
    public void countingBits01Test() {
        int n01 = 2;
        int[] result01 = {0,1,1};
        assertArrayEquals(result01, sr.countBits(n01));
    }
}