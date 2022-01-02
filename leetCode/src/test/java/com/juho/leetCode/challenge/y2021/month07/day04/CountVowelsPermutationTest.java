package com.juho.leetCode.challenge.y2021.month07.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountVowelsPermutationTest {

    CountVowelsPermutation cvp = new CountVowelsPermutation();

    @Test
    public void countVowelsPermutation01Test() {
        assertEquals(5, cvp.countVowelPermutation(1));
        assertEquals(10, cvp.countVowelPermutation(2));
        assertEquals(68, cvp.countVowelPermutation(5));
    }

}
