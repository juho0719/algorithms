package com.juho.leetCode.challenge.y2021.month10.day07;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WordSearchTest {

    WordSearch ws = new WordSearch();

    @Test
    public void wordSearch01Test() {
        char[][] board01 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word01 = "ABCCED";
        assertEquals(true, ws.exist(board01, word01));

        char[][] board02 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word02 = "ABCB";
        assertEquals(false, ws.exist(board02, word02));
    }
}