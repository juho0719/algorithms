package com.juho.leetCode.challenge.y2022.month02.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class WordLadderTest {

    WordLadder wl = new WordLadder();

    @Test
    public void wordLadder01Test() {
        String beginWord01 = "hit";
        String endWord01 = "cog";
        List<String> wordList01 = new ArrayList<>();
        wordList01.add("hot");
        wordList01.add("dot");
        wordList01.add("dog");
        wordList01.add("lot");
        wordList01.add("log");
        wordList01.add("cog");
        assertEquals(5, wl.ladderLength(beginWord01, endWord01, wordList01));
    }
}