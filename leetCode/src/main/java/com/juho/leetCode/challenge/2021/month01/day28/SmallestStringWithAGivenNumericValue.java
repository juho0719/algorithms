package com.juho.leetCode.challenge.month01.day28;

import java.util.Arrays;

public class SmallestStringWithAGivenNumericValue {

    public String getSmallestString(int n, int k) {
        
        char[] ch = new char[n];
        Arrays.fill(ch, 'a');
        k -= n;
        n--;
        
        while(k >= 26) {
            ch[n--] = 'z';
            k = k + 1 - 26;
        }
        ch[n] += k;

        return String.valueOf(ch);
    }
}
