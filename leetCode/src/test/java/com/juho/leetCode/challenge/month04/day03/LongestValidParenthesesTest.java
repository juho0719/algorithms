package com.juho.leetCode.challenge.month04.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {
    
    LongestValidParentheses lvp = new LongestValidParentheses();

    @Test
    public void longestValidParentheses01Test() {
        String s01 = "(()";
        assertEquals(2, lvp.longestValidParentheses(s01));

        String s02 = ")()())";
        assertEquals(4, lvp.longestValidParentheses(s02));

        String s03 = "";
        assertEquals(0, lvp.longestValidParentheses(s03));

        String s04 = "()(()";
        assertEquals(2, lvp.longestValidParentheses(s04));
    }
}
