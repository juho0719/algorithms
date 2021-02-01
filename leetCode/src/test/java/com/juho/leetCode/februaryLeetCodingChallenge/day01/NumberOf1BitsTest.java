package com.juho.leetCode.februaryLeetCodingChallenge.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {
    
    NumberOf1Bits nob = new NumberOf1Bits();

    @Test
    public void numberOf1Bits01Test() {
        int n01 = 11;
        assertEquals(nob.hammingWeight(n01), 3);

        int n02 = 128;
        assertEquals(nob.hammingWeight(n02), 1);
    }
}
