package com.juho.leetCode.challenge.y2021.month02.day19;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> openQuates = new Stack<>();
        int continueCount = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                openQuates.add(i);
            } else if(c == ')') {
                if(openQuates.isEmpty()) {
                    continueCount++;
                    continue;
                }
                openQuates.pop();
            }
            sb.append(c);
        }

        while(!openQuates.isEmpty()) {
            int index = openQuates.pop();
            sb.deleteCharAt(index-continueCount);
        }

        return sb.toString();
    }
}
