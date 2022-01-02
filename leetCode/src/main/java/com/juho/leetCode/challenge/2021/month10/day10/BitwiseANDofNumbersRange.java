package com.juho.leetCode.challenge.month10.day10;

public class BitwiseANDofNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int c=0;
        while(left!=right)
        {
            left>>=1;
                right>>=1;
            c+=1;
        }
        return left<<=c;
    }
}