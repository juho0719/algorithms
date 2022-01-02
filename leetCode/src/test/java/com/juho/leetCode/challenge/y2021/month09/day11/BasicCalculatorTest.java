package com.juho.leetCode.challenge.y2021.month09.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {

    BasicCalculator bc = new BasicCalculator();

    @Test
    public void basicCalculator01Test() {
        String s01 = "1 + 1";
        assertEquals(2, bc.calculate(s01));

        String s02 = " 2-1 + 2";
        assertEquals(3, bc.calculate(s02));

        String s03 = "(1+(4+5+2)-3)+(6+8)";
        assertEquals(23, bc.calculate(s03));
    }
}