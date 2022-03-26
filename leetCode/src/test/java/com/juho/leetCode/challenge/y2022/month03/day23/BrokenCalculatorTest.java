package com.juho.leetCode.challenge.y2022.month03.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BrokenCalculatorTest {

    BrokenCalculator bc = new BrokenCalculator();

    @Test
    public void brokenCalculator01Test() {
        int startValue01 = 2;
        int target01 = 3;
        assertEquals(2, bc.brokenCalc(startValue01, target01));

        int startValue02 =5;
        int target02 = 8;
        assertEquals(2, bc.brokenCalc(startValue02, target02));
    }
}