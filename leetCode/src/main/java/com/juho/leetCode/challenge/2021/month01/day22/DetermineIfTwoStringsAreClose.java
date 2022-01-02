package com.juho.leetCode.challenge.month01.day22;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int[] word1CharExist = new int[26];
        int[] word1CharCount = new int[26];
        int[] word2CharExist = new int[26];
        int[] word2CharCount = new int[26];

        for(int i=0; i<word1.length(); i++) {
            char word1Char = word1.charAt(i);
            word1CharExist[word1Char - 'a'] = 1;
            word1CharCount[word1Char - 'a']++;

            char word2Char = word2.charAt(i);
            word2CharExist[word2Char - 'a'] = 1;
            word2CharCount[word2Char - 'a']++;
        }

        Arrays.sort(word1CharCount);
        Arrays.sort(word2CharCount);

        return Arrays.equals(word1CharExist, word2CharExist) && Arrays.equals(word1CharCount, word2CharCount);
    }
}
