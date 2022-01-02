package com.juho.leetCode.challenge.y2021.month02.day27;

public class DivideTwoIntegers {
    
    public int divide(int dividend, int divisor) {
        int count = 0;
        boolean plusFlag = true;
        if(dividend == 0) return count;
        if(dividend == Integer.MIN_VALUE) {
            if(divisor == -1) return Integer.MAX_VALUE;
            else if(divisor == 1) return Integer.MIN_VALUE;
        }

        if(dividend > 0) {
            plusFlag = !plusFlag;
            dividend = -dividend;
        }
        if(divisor > 0) {
            plusFlag = !plusFlag;
            divisor = -divisor;
        }

        while(dividend <= divisor) {
            count++;
            dividend -= divisor;
        }

        return plusFlag?count:-count;
    }
}
