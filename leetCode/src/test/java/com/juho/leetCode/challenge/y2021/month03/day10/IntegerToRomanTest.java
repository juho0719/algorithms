package com.juho.leetCode.challenge.y2021.month03.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {
    
    IntegerToRoman ir = new IntegerToRoman();

    @Test
    public void integerToRoman01Test() {
        int num01 = 3;
        assertEquals(ir.intToRoman(num01), "III");
        
        int num02 = 4;
        assertEquals(ir.intToRoman(num02), "IV");

        int num03 = 9;
        assertEquals(ir.intToRoman(num03), "IX");

        int num04 = 58;
        assertEquals(ir.intToRoman(num04), "LVIII");

        int num05 = 1994;
        assertEquals(ir.intToRoman(num05), "MCMXCIV");
    }
}
