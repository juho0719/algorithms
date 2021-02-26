package com.juho.leetCode.februaryLeetCodingChallenge.day26;

import java.util.Stack;

public class ValidateStackSequences {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();

        int popIndex = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && popIndex < pushed.length && stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }

        return popIndex == pushed.length;
    }
}
