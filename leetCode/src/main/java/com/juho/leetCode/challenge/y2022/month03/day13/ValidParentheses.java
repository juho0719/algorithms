package com.juho.leetCode.challenge.y2022.month03.day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * 
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * 
 * Example 1:
 * Input: s = "()"
 * Output: true
 * 
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * 
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * 
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 */

public class ValidParentheses {
    public boolean isValid(String s) {
        String openParentheses = "({[";
        Map<String, String> parenthesesMap = new HashMap<>();
        parenthesesMap.put(")", "(");
        parenthesesMap.put("}", "{");
        parenthesesMap.put("]", "[");
        int startIndex = 0;
        Stack<String> bracketsStack = new Stack<>();

        while(s.length() > startIndex) {
            String parentheses = s.substring(startIndex, startIndex+1);
            if(bracketsStack.empty() || openParentheses.contains(parentheses)) {
                bracketsStack.add(parentheses);
                startIndex++;
            } else if(bracketsStack.pop().equals(parenthesesMap.get(parentheses))) {
                startIndex++;
            } else {
                return false;
            }
        }
        if(!bracketsStack.isEmpty()) return false;
        
        return true;
    }
}