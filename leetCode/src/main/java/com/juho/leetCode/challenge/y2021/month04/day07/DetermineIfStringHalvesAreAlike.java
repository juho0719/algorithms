package com.juho.leetCode.challenge.y2021.month04.day07;

public class DetermineIfStringHalvesAreAlike {
    String vowels = "aeiouAEIOU";
    
    public boolean halvesAreAlike(String S) {
        int mid = S.length() / 2, ans = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(S.charAt(i)) >= 0) ans++;
            if (vowels.indexOf(S.charAt(j)) >= 0) ans--;
        }
        return ans == 0;
    }
}