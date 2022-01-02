package com.juho.leetCode.challenge.month10.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordInaStringTest {

    ReverseWordInaString rws = new  ReverseWordInaString();

    @Test
    public void reverseWordInaString01Test() {
        String s01 = "the sky is blue";
        assertEquals("blue is sky the", rws.reverseWords(s01));

        String s02 = "  hello world  ";
        assertEquals("world hello", rws.reverseWords(s02));

        String s03 = "a good   example";
        assertEquals("example good a", rws.reverseWords(s03));

        String s04 = "  Bob    Loves  Alice   ";
        assertEquals("Alice Loves Bob", rws.reverseWords(s04));

        String s05 = "Alice does not even like bob";
        assertEquals("bob like even not does Alice", rws.reverseWords(s05));
    }
}