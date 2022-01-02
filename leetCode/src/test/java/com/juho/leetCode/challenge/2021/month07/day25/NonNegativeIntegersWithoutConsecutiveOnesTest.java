package com.juho.leetCode.challenge.month07.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NonNegativeIntegersWithoutConsecutiveOnesTest {

    NonNegativeIntegersWithoutConsecutiveOnes nico = new NonNegativeIntegersWithoutConsecutiveOnes();

    @Test
    public void nonNegativeIntegersWithoutConsecutiveOnes01Test() {
        int n01 = 5;
        assertEquals(5, nico.findIntegers(n01));

        int n02 = 1;
        assertEquals(2, nico.findIntegers(n02));

        int n03 = 2;
        assertEquals(3, nico.findIntegers(n03));
    }

}
