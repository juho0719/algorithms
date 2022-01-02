package com.juho.leetCode.challenge.y2021.month10.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class WordSearchIITest {

    WordSearchII ws = new WordSearchII();

    @Test
    public void wordSearchII01Test() {
        char[][] board01 = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words01 = {"oath","pea","eat","rain"};
        List<String> result01 = new ArrayList<>();
        result01.add("oath");
        result01.add("eat");
        assertEquals(result01, ws.findWords(board01, words01));

        char[][] board02 = {{'a','b'},{'c','d'}};
        String[] words02 = {"abcd"};
        List<String> result02 = new ArrayList<>();
        assertEquals(result02, ws.findWords(board02, words02));
    }
}