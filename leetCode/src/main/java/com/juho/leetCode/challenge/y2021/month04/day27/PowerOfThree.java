package com.juho.leetCode.challenge.y2021.month04.day27;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while(n > 0) {
            if(n == 1) return true;
            if(n % 3 == 0) {
                n /= 3;
            } else {
                return false;
            }
        }
        return false;
    }
}