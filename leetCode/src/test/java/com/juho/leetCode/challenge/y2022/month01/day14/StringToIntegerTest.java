package com.juho.leetCode.challenge.y2022.month01.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringToIntegerTest {
    
    StringToInteger sti = new StringToInteger();

    @Test
    public void stringToInteger01Test() {
        String s01 = "42";
        assertEquals(42, sti.myAtoi(s01));

        String s02 = "   -42";
        assertEquals(-42, sti.myAtoi(s02));

        String s03 = "4193 with words";
        assertEquals(4193, sti.myAtoi(s03));
    }
}