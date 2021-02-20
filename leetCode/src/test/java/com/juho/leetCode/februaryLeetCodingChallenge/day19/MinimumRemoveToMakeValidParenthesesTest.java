package com.juho.leetCode.februaryLeetCodingChallenge.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MinimumRemoveToMakeValidParenthesesTest {
    
    MinimumRemoveToMakeValidParentheses mrmvp = new MinimumRemoveToMakeValidParentheses();

    @Test
    public void minimumRemoveToMakeValidParentheses01Test() {
        String s01 = "lee(t(c)o)de)";
        assertEquals(mrmvp.minRemoveToMakeValid(s01), "lee(t(c)o)de");

        String s02 = "a)b(c)d";
        assertEquals(mrmvp.minRemoveToMakeValid(s02), "ab(c)d");

        String s03 = "))((";
        assertEquals(mrmvp.minRemoveToMakeValid(s03), "");

        String s04 = "(a(b(c)d)";
        assertEquals(mrmvp.minRemoveToMakeValid(s04), "a(b(c)d)");
    }
}
