package com.juho.leetCode.decemberLeetCodingChallenge.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.decemberLeetCodingChallenge.day03.BeautifulArrangement;
import com.juho.leetCode.decemberLeetCodingChallenge.day04.MergeTwoSortedLists;
import com.juho.leetCode.decemberLeetCodingChallenge.day05.RemoveDuplicatesFromSortedList02;
import com.juho.leetCode.decemberLeetCodingChallenge.day06.KthMissingPositiveNumber;
import com.juho.leetCode.decemberLeetCodingChallenge.day07.LongestSubstringWithoutRepeatingCharacters;

import static org.assertj.core.api.Assertions.*;

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