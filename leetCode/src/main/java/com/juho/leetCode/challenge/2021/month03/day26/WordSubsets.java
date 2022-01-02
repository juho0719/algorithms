package com.juho.leetCode.challenge.month03.day26;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList<>();
        
        int[] bMax = count("");
        for(String b : B) {
            int[] bCount = count(b);
            for(int i=0; i<26; i++) {
                bMax[i] = Math.max(bMax[i], bCount[i]);
            }
        }

        search: for(String a : A) {
            int[] aCount = count(a);
            for(int i=0; i<26; i++) {
                if(aCount[i] < bMax[i]) continue search;
            }
            result.add(a);
        }

        return result;
    }

    private int[] count(String B) {
        int[] count = new int[26];
        for(char c : B.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
}