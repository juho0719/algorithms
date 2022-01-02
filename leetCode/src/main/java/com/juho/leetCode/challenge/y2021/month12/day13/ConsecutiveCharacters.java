package com.juho.leetCode.challenge.y2021.month12.day13;

/**
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 * Given a string s, return the power of s.
 * 
 * Example 1:
 * Input: s = "leetcode"
 * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 * 
 * Example 2:
 * Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 * 
 * Example 3:
 * Input: s = "triplepillooooow"
 * Output: 5
 * 
 * Example 4:
 * Input: s = "hooraaaaaaaaaaay"
 * Output: 11
 * 
 * Example 5:
 * Input: s = "tourist"
 * Output: 1
 * 
 * Constraints:
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters.
 */
public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int count = 0;
        int maxCount = 0;
        char previous = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == previous) {
                count++;
            } else {
                count = 1;
                previous = c;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}