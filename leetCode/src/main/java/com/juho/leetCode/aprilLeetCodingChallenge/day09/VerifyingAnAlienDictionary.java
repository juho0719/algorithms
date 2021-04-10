package com.juho.leetCode.aprilLeetCodingChallenge.day09;

public class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length == 1) return true;

        // order weight setting
        int[] orderMap = new int[26];
        for(int i=0; i<order.length(); i++) {
            char c =order.charAt(i);
            orderMap[c - 'a'] = i;
        }

        for(int i=0; i<words.length-1; i++) {
            for(int j=0; j<words[i].length(); j++) {
                // short size check
                if(j >= words[i+1].length()) return false;

                // character check
                char curChar = words[i].charAt(j);
                char nextChar = words[i+1].charAt(j);
                if(curChar != nextChar) {
                    int curIndex = orderMap[curChar - 'a'];
                    int nextIndex = orderMap[nextChar - 'a'];
                    if(curIndex > nextIndex) return false;
                    else break;
                }
            }
        }

        return true;
    }
}