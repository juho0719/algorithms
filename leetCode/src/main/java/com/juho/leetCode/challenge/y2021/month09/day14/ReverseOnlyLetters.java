package com.juho.leetCode.challenge.y2021.month09.day14;

import java.util.Stack;

public class ReverseOnlyLetters {
    
    public String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack<>();
        for (char c: s.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);

        StringBuilder ans = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else
                ans.append(c);
        }

        return ans.toString();
    }
}