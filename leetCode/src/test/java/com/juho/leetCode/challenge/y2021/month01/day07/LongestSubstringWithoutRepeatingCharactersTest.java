package com.juho.leetCode.challenge.y2021.month01.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void longestSubstringWithoutRepeatingCharacters01Test() {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        String s5 = " ";

        assertEquals(lswrc.lengthOfLongestSubstring(s1), 3);
        assertEquals(lswrc.lengthOfLongestSubstring(s2), 1);
        assertEquals(lswrc.lengthOfLongestSubstring(s3), 3);
        assertEquals(lswrc.lengthOfLongestSubstring(s4), 0);
        assertEquals(lswrc.lengthOfLongestSubstring(s5), 1);
    }
}