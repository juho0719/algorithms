package com.juho.leetCode.challenge.month02.day21;

public class BrokenCalculator {
    
    public int brokenCalc(int X, int Y) {
        int operationCount = 0;    
        while(X < Y) {
            operationCount++;
            if(Y % 2 > 0) {
                Y++;
            } else {
                Y /= 2;
            }
        }
        return X - Y + operationCount;
    }
}
