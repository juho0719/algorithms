package com.juho.leetCode.februaryLeetCodingChallenge.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LongestWordInDictionaryThroughDeletingTest {
    
    LongestWordInDictionaryThroughDeleting blwdd = new LongestWordInDictionaryThroughDeleting();

    @Test
    public void longestWordInDictionaryThroughDeleting01Test() {
        String s01 = "abpcplea";
        List<String> d01 = new ArrayList<>();
        d01.add("ale");
        d01.add("apple");
        d01.add("monkey");
        d01.add("plea");
        assertEquals(blwdd.findLongestWord(s01, d01), "apple");

        String s02 = "abpcplea";
        List<String> d02 = new ArrayList<>();
        d02.add("a");
        d02.add("b");
        d02.add("c");
        assertEquals(blwdd.findLongestWord(s02, d02), "a");

        String s03 = "bab";
        List<String> d03 = new ArrayList<>();
        d03.add("ba");
        d03.add("ab");
        d03.add("a");
        d03.add("b");
        assertEquals(blwdd.findLongestWord(s03, d03), "ab");
    }
}
