package com.juho.leetCode.challenge.y2021.month12.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerOfTwoTest {

    PowerOfTwo pt = new PowerOfTwo();

    @Test
    public void powerOfTwo01Test() {
        int n01 = 1;
        assertEquals(true, pt.isPowerOfTwo(n01));

        int n02 = 16;
        assertEquals(true, pt.isPowerOfTwo(n02));

        int n03 = 3;
        assertEquals(false, pt.isPowerOfTwo(n03));
    }
}