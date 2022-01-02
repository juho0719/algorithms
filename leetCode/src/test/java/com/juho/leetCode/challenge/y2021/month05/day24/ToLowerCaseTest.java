package com.juho.leetCode.challenge.y2021.month05.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ToLowerCaseTest {
    
    ToLowerCase lc = new ToLowerCase();

    @Test
    public void toLowerCase01Test() {
        String s01 = "Hello";
        assertEquals("hello", lc.toLowerCase(s01));

        String s02 = "here";
        assertEquals("here", lc.toLowerCase(s02));

        String s03 = "LOVELY";
        assertEquals("lovely", lc.toLowerCase(s03));
    }
}