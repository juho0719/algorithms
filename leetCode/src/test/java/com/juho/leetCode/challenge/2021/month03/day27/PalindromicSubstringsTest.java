package com.juho.leetCode.challenge.month03.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromicSubstringsTest {
    
    PalindromicSubstrings ps = new PalindromicSubstrings();

    @Test
    public void palindromicSubstrings01Test() {
        String s01 = "abc";
        assertEquals(3, ps.countSubstrings(s01));

        String s02 = "aaa";
        assertEquals(6, ps.countSubstrings(s02));
    }
}
