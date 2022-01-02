package com.juho.leetCode.challenge.y2021.month09.day23;

public class BreakaPalindrome {
    public String breakPalindrome(String palindrome) {
        int length = palindrome.length();
        if (length == 1) { 
            return "";
        }
        char[] palindromeArray = palindrome.toCharArray();
        
        for (int i = 0; i < length / 2; i++) {
            if (palindromeArray[i] != 'a') {
                palindromeArray[i] = 'a';
                return String.valueOf(palindromeArray);
            }
        }
        
        palindromeArray[length - 1] = 'b';
        return String.valueOf(palindromeArray);
    }
}