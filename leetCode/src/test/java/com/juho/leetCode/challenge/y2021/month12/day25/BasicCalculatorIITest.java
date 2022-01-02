package com.juho.leetCode.challenge.y2021.month12.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BasicCalculatorIITest {

    BasicCalculatorII bc2 = new BasicCalculatorII();

    @Test
    public void basicCalculatorII01Test() {
        String s01 = "3+2*2";
        assertEquals(7, bc2.calculate(s01));

        String s02 = " 3/2 ";
        assertEquals(1, bc2.calculate(s02));

        String s03 = " 3+5 / 2 ";
        assertEquals(5, bc2.calculate(s03));
    }
}