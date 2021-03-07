package com.juho.leetCode.marchLeetCodingChallenge.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShortEncodingOfWordsTest {
    
    ShortEncodingOfWords sew = new ShortEncodingOfWords();

    @Test
    public void averageOfLevelsInBinaryTree01Test() {
        String[] words01 = {"time", "me", "bell"};
        assertEquals(sew.minimumLengthEncoding(words01), 10);

        // String[] words02 = {"t"};
        // assertEquals(sew.minimumLengthEncoding(words02), 2);
    }
}
