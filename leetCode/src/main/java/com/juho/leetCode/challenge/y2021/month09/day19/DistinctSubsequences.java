package com.juho.leetCode.challenge.y2021.month09.day19;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        if(t.length()>s.length()) return 0;
        int[][] result = new int[t.length()+1][s.length()+1];
        for(int j=0; j<=s.length(); j++) result[0][j] = 1;
        for(int i=0; i<t.length(); i++) {
            for(int j=0; j<s.length(); j++) {
                if(t.charAt(i) == s.charAt(j))  result[i+1][j+1] = result[i][j] + result[i+1][j];
                else    result[i+1][j+1] = result[i+1][j];
            }  
        }
        return result[t.length()][s.length()];
    }
}