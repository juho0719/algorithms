package com.juho.leetCode.challenge.y2021.month01.day27;

public class ConcatenationOfConsecutiveBinaryNumbers {

    public int concatenatedBinary(int n) {
        int digits = 0, MOD = 1000000007;
        long result = 0;
        for(int i = 1; i <= n; i++){
            if((i & (i - 1)) == 0) digits++; 
            result = ((result << digits) + i) % MOD;
        }
        return (int) result;
    }
}
