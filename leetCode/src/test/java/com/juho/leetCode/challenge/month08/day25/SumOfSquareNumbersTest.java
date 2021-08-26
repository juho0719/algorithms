package com.juho.leetCode.challenge.month08.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumOfSquareNumbersTest {

    SumOfSquareNumbers ssn = new SumOfSquareNumbers();

    @Test
    public void sumOfSquareNumbers01Test() {
        int c01 = 5;
        assertEquals(true, ssn.judgeSquareSum(c01));

        int c02 = 3;
        assertEquals(false, ssn.judgeSquareSum(c02));

        int c03 = 4;
        assertEquals(true, ssn.judgeSquareSum(c03));

        int c04 = 2;
        assertEquals(true, ssn.judgeSquareSum(c04));

        int c05 = 1;
        assertEquals(true, ssn.judgeSquareSum(c05));
    }
}