package com.juho.leetCode.challenge.month02.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ScoreOfParenthesesTest {
    
    ScoreOfParentheses sp = new ScoreOfParentheses();

    @Test
    public void scoreOfParentheses01Test() {
        String input01 = "()";
        assertEquals(sp.scoreOfParentheses(input01), 1);

        String input02 = "(())";
        assertEquals(sp.scoreOfParentheses(input02), 2);

        String input03 = "()()";
        assertEquals(sp.scoreOfParentheses(input03), 2);

        String input04 = "(()(()))";
        assertEquals(sp.scoreOfParentheses(input04), 6);
    }
}
