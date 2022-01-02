package com.juho.leetCode.challenge.y2021.month10.day30;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestDuplicateSubstringTest {

    LongestDuplicateSubstring lds = new LongestDuplicateSubstring();

    @Test
    public void longestDuplicateSubstring01Test() {
        String s01 = "banana";
        assertEquals("ana", lds.longestDupSubstring(s01));
        
        String s02 = "abcd";
        assertEquals("", lds.longestDupSubstring(s02));
    }
}