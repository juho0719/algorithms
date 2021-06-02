package com.juho.leetCode.challenge.month05.day25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {
    
    EvaluateReversePolishNotation erpn = new EvaluateReversePolishNotation();

    @Test
    public void evaluateReversePolishNotation01Test() {
        String[] tokens01 = {"2", "1", "+", "3", "*"};
        assertEquals(9, erpn.evalRPN(tokens01));

        String[] tokens02 = {"4", "13", "5", "/", "+"};
        assertEquals(6, erpn.evalRPN(tokens02));
    }
}