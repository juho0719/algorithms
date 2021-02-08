package com.juho.leetCode.februaryLeetCodingChallenge.day07;

public class ShortestDistanceToACharacter {

    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int charIndex = Integer.MIN_VALUE / 2;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) charIndex = i;
            result[i] = i - charIndex;
        }

        charIndex = Integer.MAX_VALUE / 2;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == c) charIndex = i;
            result[i] = Math.min(result[i], charIndex - i);
        }

        return result;
    }
}
