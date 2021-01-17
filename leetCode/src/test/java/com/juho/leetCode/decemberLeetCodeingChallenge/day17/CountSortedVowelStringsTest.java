package com.juho.leetCode.decemberLeetCodingChallenge.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.decemberLeetCodingChallenge.day17.CountSortedVowelStrings;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CountSortedVowelStringsTest {

    CountSortedVowelStrings csvs = new CountSortedVowelStrings();

    @Test
    public void countSortedVowelStrings01Test() {
        assertEquals(csvs.countVowelStrings(1), 5);
        assertEquals(csvs.countVowelStrings(2), 15);
        assertEquals(csvs.countVowelStrings(3), 25);
        assertEquals(csvs.countVowelStrings(33), 66045);
    }
}