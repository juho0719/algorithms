package com.juho.leetCode.challenge.y2021.month01.day19;

public class LongestPalindromicSubstring {
    
    int maxLen = 0;
    int startIndex =0;

    public String longestPalindrome(String s) {
        maxLen = 0;
        startIndex = 0;
        
        if(s.length()<=1){
            return s;
        }
        for(int i=0;i<s.length();i++){
            checkForLongestPalindromicString(s, i, i); // odd length palindromic substring
            checkForLongestPalindromicString(s, i, i+1); // even length palindromic substring
        }
        return s.substring(startIndex, maxLen+startIndex);
    }

    private void checkForLongestPalindromicString(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        if(maxLen< right-left -1){
            maxLen = right -left-1;
            startIndex = left+1;
        }
    }
}