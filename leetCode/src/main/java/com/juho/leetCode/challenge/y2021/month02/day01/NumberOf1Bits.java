package com.juho.leetCode.challenge.y2021.month02.day01;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0) {
            count+=(n&1);
            n=n>>>1;
        }
        return count;
    }
}
