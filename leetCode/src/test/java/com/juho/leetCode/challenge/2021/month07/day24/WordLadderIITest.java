package com.juho.leetCode.challenge.month07.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WordLadderIITest {

    @Test
    public void wordLadderII01Test() {
        WordLadderII wlii01 = new WordLadderII();

        String beginWord01 = "hit";
        String endWord01 = "cog";
        List<String> wordList01 = new ArrayList<>();
        wordList01.add("hot");
        wordList01.add("dot");
        wordList01.add("dog");
        wordList01.add("lot");
        wordList01.add("log");
        wordList01.add("cog");

        List<List<String>> result100 = new ArrayList<>();
        List<String> result101 = new ArrayList<>();
        result101.add("hit");
        result101.add("hot");
        result101.add("dot");
        result101.add("dog");
        result101.add("cog");
        result100.add(result101);
        List<String> result102 = new ArrayList<>();
        result102.add("hit");
        result102.add("hot");
        result102.add("lot");
        result102.add("log");
        result102.add("cog");
        result100.add(result102);
        assertEquals(result100, wlii01.findLadders(beginWord01, endWord01, wordList01));

        WordLadderII wlii02 = new WordLadderII();
        String beginWord02 = "hit";
        String endWord02 = "cog";
        List<String> wordList02 = new ArrayList<>();
        wordList02.add("hot");
        wordList02.add("dot");
        wordList02.add("dog");
        wordList02.add("lot");
        wordList02.add("log");

        List<List<String>> result200 = new ArrayList<>();
        assertEquals(result200, wlii02.findLadders(beginWord02, endWord02, wordList02));
    }

}
