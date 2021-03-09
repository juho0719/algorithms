package com.juho.leetCode.marchLeetCodingChallenge.day08;

public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if(s.length() == 0) return 0;
        if(checkPalindrome(s)) {
            return 1;
        } 
        return 2;
    }

    private boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right) { 
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}