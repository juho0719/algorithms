package com.juho.leetCode.challenge.month05.day04;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        boolean isMostOne = false;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                if(isMostOne || (i>1 && i<nums.length-1 && nums[i-2] > nums[i] && nums[i-1] > nums[i+1] )) {
                    return false;
                }
                isMostOne = true;
            }
        }
        return true;
    }
}