package com.juho.leetCode.challenge.y2021.month05.day25;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    private Set<String> ops = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (!ops.contains(t)) stack.push(Integer.parseInt(t));
            else {
                int b = stack.pop(), a = stack.pop();
                if (t.equals("+")) stack.push(a + b);
                else if (t.equals("-")) stack.push(a - b);
                else if (t.equals("*")) stack.push(a * b);
                else stack.push(a / b);
            }
        }
        return stack.pop();
    }
}
