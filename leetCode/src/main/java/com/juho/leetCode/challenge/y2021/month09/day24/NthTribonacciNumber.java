package com.juho.leetCode.challenge.y2021.month09.day24;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        int result = 0;
        
        if(n<1) return 0;
        if(n==1 || n==2) return 1;
        for(int i=3;i<=n;i++){
            result = n0 + n1 + n2;
            n0 = n1;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}