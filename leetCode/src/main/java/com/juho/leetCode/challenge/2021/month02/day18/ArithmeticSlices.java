package com.juho.leetCode.challenge.month02.day18;


public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length ;
        if(n < 3) return 0;
        int count = 0;
        int dp = 0;

        for(int i=1; i<n-1; i++) {
            if(A[i-1]-A[i] == A[i]-A[i+1]) {
                dp += 1;
                count += dp;
            } else {
                dp = 0;
            }
        }
        return count;
    }
}
