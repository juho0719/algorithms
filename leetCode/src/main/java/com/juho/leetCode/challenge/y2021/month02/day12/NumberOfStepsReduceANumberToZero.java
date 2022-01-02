package com.juho.leetCode.challenge.y2021.month02.day12;

public class NumberOfStepsReduceANumberToZero {

    public int numberOfSteps (int num) {
    
        int count = 0;
        while(num > 0) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }

        return count;
    }
}
