package com.juho.leetCode.decemberLeetCodingChallenge.day07;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s == "") return 0;
    
        int result = 0;
        int head = 0, tail = 0;
        Set<String> dupCheck = new HashSet<>();
        while(head < s.length()) {
            if(head == tail) {
                dupCheck = new HashSet<>();
                dupCheck.add(s.substring(head, head+1));
                tail++;
            } else if(tail == s.length()) {
                if(result < tail - head) {
                    result = tail - head;
                }
                break;
            } else if(dupCheck.contains(s.substring(tail, tail+1))) {
                if(result < tail - head) {
                    result = tail - head;
                }
                head++;
                tail = head;
            } else {
                dupCheck.add(s.substring(tail, tail+1));
                tail++;
            }
        }
        return result;
    }

}