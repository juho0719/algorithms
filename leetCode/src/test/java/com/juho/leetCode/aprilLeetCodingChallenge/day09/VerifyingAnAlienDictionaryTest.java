package com.juho.leetCode.aprilLeetCodingChallenge.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VerifyingAnAlienDictionaryTest {

    VerifyingAnAlienDictionary vad = new VerifyingAnAlienDictionary();

    @Test
    public void verifyingAnAlienDictionary01Test() {
        String[] words01 = {"hello", "leetcode"};
        String order01 = "hlabcdefgijkmnopqrstuvwxyz";
        assertEquals(true, vad.isAlienSorted(words01, order01));

        String[] words02 = {"word", "world", "row"};
        String order02 = "worldabcefghijkmnpqstuvxyz";
        assertEquals(false, vad.isAlienSorted(words02, order02));

        String[] words03 = {"apple", "app"};
        String order03 = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(false, vad.isAlienSorted(words03, order03));
    }
}
