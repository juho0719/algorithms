package com.juho.leetCode.challenge.month10.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ImplementTrieTest {

    ImplementTrie it = new ImplementTrie();

    @Test
    public void implementTrie01Test() {
        it.insert("aabbcde");
        assertEquals(true, it.search("aabbcde"));
        assertEquals(false, it.startsWith("ab"));
    }
}