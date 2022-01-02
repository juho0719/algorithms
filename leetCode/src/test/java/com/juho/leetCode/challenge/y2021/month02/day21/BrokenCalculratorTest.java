package com.juho.leetCode.challenge.y2021.month02.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BrokenCalculratorTest {
    
    BrokenCalculator bc = new BrokenCalculator();

    @Test
    public void brokenCalculator01Test() {
        int X01 = 2;
        int Y01 = 3;
        assertEquals(bc.brokenCalc(X01, Y01), 2);

        int X02 = 5;
        int Y02 = 8;
        assertEquals(bc.brokenCalc(X02, Y02), 2);

        int X03 = 3;
        int Y03 = 10;
        assertEquals(bc.brokenCalc(X03, Y03), 3);

        int X04 = 1024;
        int Y04 = 1;
        assertEquals(bc.brokenCalc(X04, Y04), 1023);
    }
}
