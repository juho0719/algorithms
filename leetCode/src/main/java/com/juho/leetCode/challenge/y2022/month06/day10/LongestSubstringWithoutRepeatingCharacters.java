package com.juho.leetCode.challenge.y2022.month06.day10;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * 
 * Example 2:
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * Constraints:
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s == "") return 0;

        int result = 0;
        int head = 0, tail = 0;
        Set<String> dupCheck = new HashSet<>();
        while(head < s.length()) {
            if(head == tail) {
                dupCheck = new HashSet<>();
                dupCheck.add(s.substring(head, head+1));
                tail++;
            } else if(tail == s.length()) {
                if(result < tail - head) {
                    result = tail - head;
                }
                break;
            } else if(dupCheck.contains(s.substring(tail, tail+1))) {
                if(result < tail - head) {
                    result = tail - head;
                }
                head++;
                tail = head;
            } else {
                dupCheck.add(s.substring(tail, tail+1));
                tail++;
            }
        }
        return result;
    }
}