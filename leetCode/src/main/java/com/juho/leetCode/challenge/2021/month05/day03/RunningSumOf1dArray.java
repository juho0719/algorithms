package com.juho.leetCode.challenge.month05.day03;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;    
    }
}