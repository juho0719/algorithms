package com.juho.leetCode.challenge.y2022.month03.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ScoreOfParenthesesTest {

    ScoreOfParentheses sp = new ScoreOfParentheses();

    @Test
    public void scoreOfParentheses01Test() {
        String s01 = "()";
        assertEquals(1, sp.scoreOfParentheses(s01));

        String s02 = "(())";
        assertEquals(2, sp.scoreOfParentheses(s02));
    }
}