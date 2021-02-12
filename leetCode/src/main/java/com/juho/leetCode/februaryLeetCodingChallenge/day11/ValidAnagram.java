package com.juho.leetCode.februaryLeetCodingChallenge.day11;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int alpha : count) {
            if(alpha != 0) return false;
        }
        return true;
    }
}
