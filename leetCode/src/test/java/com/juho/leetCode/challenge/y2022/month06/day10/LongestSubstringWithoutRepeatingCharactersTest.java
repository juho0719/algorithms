package com.juho.leetCode.challenge.y2022.month06.day10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters lsrc = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void longestSubstringWithoutRepeatingCharacters01Test() {
        String s01 = "abcabcbb";
        assertEquals(3, lsrc.lengthOfLongestSubstring(s01));        
    }
}