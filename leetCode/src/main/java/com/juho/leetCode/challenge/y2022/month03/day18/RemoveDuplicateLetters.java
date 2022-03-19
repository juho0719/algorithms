package com.juho.leetCode.challenge.y2022.month03.day18;

import java.util.Stack;

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once. 
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 * 
 * Example 1:
 * Input: s = "bcabc"
 * Output: "abc"
 * 
 * Example 2:
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 * 
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of lowercase English letters.
 */

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            if (seen[curr]) continue;
            while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
                seen[st.pop()] = false;
            }
            st.push(curr);
            seen[curr] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() + 'a'));
        return sb.reverse().toString();
    }
}