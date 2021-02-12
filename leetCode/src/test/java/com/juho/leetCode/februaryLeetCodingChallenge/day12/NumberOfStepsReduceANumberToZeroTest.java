package com.juho.leetCode.februaryLeetCodingChallenge.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberOfStepsReduceANumberToZeroTest {
    
    NumberOfStepsReduceANumberToZero nsrnz = new NumberOfStepsReduceANumberToZero();

    @Test
    public void numberOfStepsReduceANumberToZero01Test() {
        int num01 = 14;
        assertEquals(nsrnz.numberOfSteps(num01), 6);

        int num02 = 8;
        assertEquals(nsrnz.numberOfSteps(num02), 4);

        int num03 = 123;
        assertEquals(nsrnz.numberOfSteps(num03), 12);
    }
}
