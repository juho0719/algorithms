package com.juho.leetCode.challenge.y2022.month03.day15;

import java.util.Stack;

/**
 * Given a string s of '(' , ')' and lowercase English characters.
 * Your task is to remove the minimum number of parentheses ( '(' or ')', 
 * in any positions ) so that the resulting parentheses string is valid and return any valid string.
 * 
 * Formally, a parentheses string is valid if and only if:
 * - It is the empty string, contains only lowercase characters, or
 * - It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * - It can be written as (A), where A is a valid string.
 * 
 * Example 1:
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 * 
 * Example 2:
 * Input: s = "a)b(c)d"
 * Output: "ab(c)d"
 * 
 * Example 3:
 * Input: s = "))(("
 * Output: ""
 * Explanation: An empty string is also valid.
 * 
 * Constraints:
 * 1 <= pushed.length <= 1000
 * 0 <= pushed[i] <= 1000
 * All the elements of pushed are unique.
 * popped.length == pushed.length
 * popped is a permutation of pushed.
 */

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