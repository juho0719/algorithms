package com.juho.leetCode.challenge.y2021.month12.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DecodeStringTest {

    @Test
    public void decodeString01Test() {
        DecodeString ds01 = new DecodeString();
        String s01 = "3[a]2[bc]";
        assertEquals("aaabcbc", ds01.decodeString(s01));

        DecodeString ds02 = new DecodeString();
        String s02 = "3[a2[c]]";
        assertEquals("accaccacc", ds02.decodeString(s02));

        DecodeString ds03 = new DecodeString();
        String s03 = "2[abc]3[cd]ef";
        assertEquals("abcabccdcdcdef", ds03.decodeString(s03));

        DecodeString ds04 = new DecodeString();
        String s04 = "abc3[cd]xyz";
        assertEquals("abccdcdcdxyz", ds04.decodeString(s04));
    }
}