package com.juho.leetCode.challenge.y2022.month03.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void validParentheses01Test() {
        String s01 = "()";
        assertEquals(true, vp.isValid(s01));

        String s02 = "()[]{}";
        assertEquals(true, vp.isValid(s02));
    }
}