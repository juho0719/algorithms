package com.juho.leetCode.challenge.y2021.month04.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {

    PowerOfThree pt = new PowerOfThree();

    @Test
    public void powerOfThree01Test() {
        assertEquals(true, pt.isPowerOfThree(27));
        assertEquals(false, pt.isPowerOfThree(0));
        assertEquals(true, pt.isPowerOfThree(9));
        assertEquals(false, pt.isPowerOfThree(45));
        assertEquals(true, pt.isPowerOfThree(1));
        assertEquals(false, pt.isPowerOfThree(-3));
    }

}
