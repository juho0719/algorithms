package com.juho.leetCode.challenge.month06.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {

    GenerateParentheses gp = new GenerateParentheses();

    @Test
    public void generateParentheses01Test() {
        int n01 = 3;
        List<String> result01 = new ArrayList<>();
        result01.add("((()))");
        result01.add("(()())");
        result01.add("(())()");
        result01.add("()(())");
        result01.add("()()()");
        assertEquals(result01, gp.generateParenthesis(n01));

        int n02 = 1;
        List<String> result02 = new ArrayList<>();
        result02.add("()");
        assertEquals(result02, gp.generateParenthesis(n02));
    }

}
