package com.juho.leetCode.decemberLeetCodingChallenge.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class WordLadderTest {

    WordLadder wordLadder = new WordLadder();

    @Test
    public void checkIfTwoStringArraysAreEquivalent01Test() {
        String beginWord01 = "hit";
        String endWord01 = "cog";
        List<String> wordList01 = new ArrayList<>();
        wordList01.add("hot");
        wordList01.add("dot");
        wordList01.add("dog");
        wordList01.add("lot");
        wordList01.add("log");
        wordList01.add("cog");
        assertEquals(wordLadder.ladderLength(beginWord01, endWord01, wordList01), 5);

        String beginWord02 = "hit";
        String endWord02 = "cog";
        List<String> wordList02 = new ArrayList<>();
        wordList02.add("hot");
        wordList02.add("dot");
        wordList02.add("dog");
        wordList02.add("lot");
        wordList02.add("log");
        assertEquals(wordLadder.ladderLength(beginWord02, endWord02, wordList02), 0);

        String beginWord03 = "a";
        String endWord03 = "c";
        List<String> wordList03 = new ArrayList<>();
        wordList03.add("a");
        wordList03.add("b");
        wordList03.add("c");
        assertEquals(wordLadder.ladderLength(beginWord03, endWord03, wordList03), 2);

        String beginWord04 = "hot";
        String endWord04 = "dog";
        List<String> wordList04 = new ArrayList<>();
        wordList04.add("hot");
        wordList04.add("dog");
        assertEquals(wordLadder.ladderLength(beginWord04, endWord04, wordList04), 0);

        String beginWord05 = "hot";
        String endWord05 = "dot";
        List<String> wordList05 = new ArrayList<>();
        wordList05.add("hot");
        wordList05.add("dot");
        wordList05.add("dog");
        assertEquals(wordLadder.ladderLength(beginWord05, endWord05, wordList05), 2);

        String beginWord06 = "hot";
        String endWord06 = "dog";
        List<String> wordList06 = new ArrayList<>();
        wordList06.add("hot");
        wordList06.add("cog");
        wordList06.add("dog");
        wordList06.add("tot");
        wordList06.add("hog");
        wordList06.add("hop");
        wordList06.add("pot");
        wordList06.add("dot");
        assertEquals(wordLadder.ladderLength(beginWord06, endWord06, wordList06), 3);
    }
}