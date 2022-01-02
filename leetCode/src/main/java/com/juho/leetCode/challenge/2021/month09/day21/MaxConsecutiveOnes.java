package com.juho.leetCode.challenge.month09.day21;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE; 
        int cnt = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                cnt=0;
            } else if(nums[i]==1) {
                cnt++;
            }
            max = Math.max(max,cnt);
        }
        return max; 
    }
}