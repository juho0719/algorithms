package com.juho.leetCode.challenge.month06.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberOfMatchingSubsequencesTest {

    NumberOfMatchingSubsequences nms = new NumberOfMatchingSubsequences();

    @Test
    public void numberOfMatchingSubsequences01Test() {
        String s01 = "abcde";
        String[] words01 = {"a", "bb", "acd", "ace"};
        assertEquals(3, nms.numMatchingSubseq(s01, words01));

        String s02 = "dsahjpjauf";
        String[] words02 = {"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        assertEquals(2, nms.numMatchingSubseq(s02, words02));
    }

}
