package com.juho.leetCode.challenge.y2022.month03.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumRemoveToMakeValidParenthesesTest {

    MinimumRemoveToMakeValidParentheses mrmp = new MinimumRemoveToMakeValidParentheses();

    @Test
    public void minimumRemoveToMakeValidParentheses01Test() {
        String s01 = "lee(t(c)o)de)";
        String result01 = "lee(t(c)o)de";
        assertEquals(result01, mrmp.minRemoveToMakeValid(s01));

        String s02 = "a)b(c)d";
        String result02 = "ab(c)d";
        assertEquals(result02, mrmp.minRemoveToMakeValid(s02));
    }
}