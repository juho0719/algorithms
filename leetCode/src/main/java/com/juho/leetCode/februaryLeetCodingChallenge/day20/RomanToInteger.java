package com.juho.leetCode.februaryLeetCodingChallenge.day20;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = getRomanMap();
        int result = 0;
        char beforeChar = 'a';
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if((c == 'V' || c == 'X') && beforeChar == 'I') {
                result += romanMap.get(c) - (romanMap.get(beforeChar)*2);
            } else if((c == 'L' || c == 'C') && beforeChar == 'X') {
                result += romanMap.get(c) - (romanMap.get(beforeChar)*2);
            } else if((c == 'D' || c == 'M') && beforeChar == 'C') {
                result += romanMap.get(c) - (romanMap.get(beforeChar)*2);
            } else {
                result += romanMap.get(c);
            }
            beforeChar = c;
        }
        return result;
    }

    private Map<Character, Integer> getRomanMap() {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        return romanMap;
    }
}
