package com.juho.leetCode.decemberLeetCodingChallenge.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.decemberLeetCodingChallenge.day03.BeautifulArrangement;
import com.juho.leetCode.decemberLeetCodingChallenge.day04.MergeTwoSortedLists;
import com.juho.leetCode.decemberLeetCodingChallenge.day05.RemoveDuplicatesFromSortedList02;
import com.juho.leetCode.decemberLeetCodingChallenge.day06.KthMissingPositiveNumber;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KthMissingPositiveNumberTest {

    KthMissingPositiveNumber kmpn = new KthMissingPositiveNumber();

    @Test
    public void findKthPositive01Test() {
        int[] arr1 = new int[]{2,3,4,7,11};
        int k1 = 5;

        int[] arr2 = new int[]{1,2,3,4};
        int k2 = 2;

        assertEquals(kmpn.findKthPositive(arr1, k1), 9);
        assertEquals(kmpn.findKthPositive(arr2, k2), 6);
    }
}