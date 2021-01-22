package com.juho.leetCode.decemberLeetCodingChallenge.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

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