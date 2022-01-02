package com.juho.leetCode.challenge.y2021.month02.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
    
    RomanToInteger ri = new RomanToInteger();

    @Test
    public void minimumRemoveToMakeValidParentheses01Test() {
        String s01 = "III";
        assertEquals(ri.romanToInt(s01), 3);

        String s02 = "IV";
        assertEquals(ri.romanToInt(s02), 4);

        String s03 = "IX";
        assertEquals(ri.romanToInt(s03), 9);

        String s04 = "LVIII";
        assertEquals(ri.romanToInt(s04), 58);

        String s05 = "MCMXCIV";
        assertEquals(ri.romanToInt(s05), 1994);
    }
}
