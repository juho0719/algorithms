package com.juho.leetCode.challenge.month12.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumbersAtMostNGivenDigitSetTest {

    NumbersAtMostNGivenDigitSet nmgd = new NumbersAtMostNGivenDigitSet();

    @Test
    public void numbersAtMostNGivenDigitSet01Test() {
        String[] digits01 = {"1","3","5","7"};
        int n01 = 100;
        assertEquals(20, nmgd.atMostNGivenDigitSet(digits01, n01));

        String[] digits02 = {"1","4","9"};
        int n02 = 1000000000;
        assertEquals(29523, nmgd.atMostNGivenDigitSet(digits02, n02));

        String[] digits03 = {"7"};
        int n03 = 8;
        assertEquals(1, nmgd.atMostNGivenDigitSet(digits03, n03));
    }
}