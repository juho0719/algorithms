package com.juho.leetCode.challenge.month07.day14;

public class CustomSortString {
    
    public String customSortString(String order, String s) {
        int[] charCount = new int[26];
        for(char c : s.toCharArray()){
            charCount[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            while(charCount[c - 'a'] --> 0){
                sb.append(c);
            }
        }
        
        for(int i = 0; i < 26; i++){
            char c = (char)('a' + i);
            while(charCount[i] --> 0){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}