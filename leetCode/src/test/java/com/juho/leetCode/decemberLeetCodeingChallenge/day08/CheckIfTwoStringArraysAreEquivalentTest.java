package com.juho.leetCode.decemberLeetCodingChallenge.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.decemberLeetCodingChallenge.day03.BeautifulArrangement;
import com.juho.leetCode.decemberLeetCodingChallenge.day04.MergeTwoSortedLists;
import com.juho.leetCode.decemberLeetCodingChallenge.day05.RemoveDuplicatesFromSortedList02;
import com.juho.leetCode.decemberLeetCodingChallenge.day06.KthMissingPositiveNumber;
import com.juho.leetCode.decemberLeetCodingChallenge.day07.LongestSubstringWithoutRepeatingCharacters;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {

    CheckIfTwoStringArraysAreEquivalent ctsaae = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    public void checkIfTwoStringArraysAreEquivalent01Test() {
        String[] word01 = {"ab", "c"};
        String[] word02 = {"a", "bc"};
        assertEquals(ctsaae.arrayStringsAreEqual(word01, word02), true);

        String[] word11 = {"a", "cb"};
        String[] word12 = {"ab", "c"};
        assertEquals(ctsaae.arrayStringsAreEqual(word11, word12), false);

        String[] word21 = {"abc", "d", "defg"};
        String[] word22 = {"abcddefg"};
        assertEquals(ctsaae.arrayStringsAreEqual(word21, word22), true);
    }
}