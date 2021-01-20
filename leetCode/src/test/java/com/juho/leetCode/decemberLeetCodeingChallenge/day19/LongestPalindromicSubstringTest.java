package com.juho.leetCode.decemberLeetCodingChallenge.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring lpds = new LongestPalindromicSubstring();

    @Test
    public void longestPalindromicSubstring01Test() {
        String s01 = "babad";
        assertEquals(lpds.longestPalindrome(s01), "bab");

        String s02 = "cbbd";
        assertEquals(lpds.longestPalindrome(s02), "bb");

        String s03 = "a";
        assertEquals(lpds.longestPalindrome(s03), "a");
        
        String s04 = "ac";
        assertEquals(lpds.longestPalindrome(s04), "a");
    }
}