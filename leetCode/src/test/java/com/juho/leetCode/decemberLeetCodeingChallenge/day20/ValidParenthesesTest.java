package com.juho.leetCode.decemberLeetCodingChallenge.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void longestPalindromicSubstring01Test() {
        String s01 = "()";
        assertEquals(vp.isValid(s01), true);

        String s02 = "()[]{}";
        assertEquals(vp.isValid(s02), true);

        String s03 = "(]";
        assertEquals(vp.isValid(s03), false);

        String s04 = "([)]";
        assertEquals(vp.isValid(s04), false);

        String s05 = "[{}]";
        assertEquals(vp.isValid(s05), true);
    }
}