package com.juho.leetCode.marchLeetCodingChallenge.day03;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int numsSum = 0;
        for(int i=0; i<nums.length; i++) {
            numsSum += nums[i];
        }
        int n = nums.length+1;
        int expectedSum = n * (n-1) / 2;

        return expectedSum - numsSum;
    }
}