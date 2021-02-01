package com.juho.leetCode.jenuaryLeetCodingChallenge.day08;

public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb01 = new StringBuilder();
        for(String word : word1) {
            sb01.append(word);
        }

        StringBuilder sb02 = new StringBuilder();
        for(String word : word2) {
            sb02.append(word);
        }

        if(sb01.toString().equals(sb02.toString())) {
            return true;
        } else {
            return false;
        }
    }    
}