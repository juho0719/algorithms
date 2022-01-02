package com.juho.leetCode.challenge.y2021.month02.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DivideTwoIntegersTest {
    
    DivideTwoIntegers dti = new DivideTwoIntegers();

    @Test
    public void shortestUnsortedContinuousSubarray01Test() {
        int dividend01 = 10;
        int divisor01 = 3;
        assertEquals(dti.divide(dividend01, divisor01), 3);
        
        int dividend02 = 7;
        int divisor02 = -3;
        assertEquals(dti.divide(dividend02, divisor02), -2);

        int dividend03 = 0;
        int divisor03 = 1;
        assertEquals(dti.divide(dividend03, divisor03), 0);

        int dividend04 = 1;
        int divisor04 = 1;
        assertEquals(dti.divide(dividend04, divisor04), 1);

        int dividend05 = Integer.MIN_VALUE;
        int divisor05 = -1;
        assertEquals(dti.divide(dividend05, divisor05), Integer.MAX_VALUE);

        int dividend06 = Integer.MIN_VALUE;
        int divisor06 = 1;
        assertEquals(dti.divide(dividend06, divisor06), Integer.MIN_VALUE);

        int dividend07 = Integer.MIN_VALUE;
        int divisor07 = 2;
        assertEquals(dti.divide(dividend07, divisor07), -1073741824);
    }
}
