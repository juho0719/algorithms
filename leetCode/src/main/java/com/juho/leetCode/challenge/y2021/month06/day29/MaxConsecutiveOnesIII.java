package com.juho.leetCode.challenge.y2021.month06.day29;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int numKRemain = k;
        int left = 0;
        int right = 0;
        int res = Integer.MIN_VALUE;
        while(right < nums.length) {
            if(nums[right] == 1){
                right++;
            }
            else {
                if(numKRemain > 0){
                    right++;
                    numKRemain--;
                }
                else{
                    res = Math.max(res, (right - left));
                    while(nums[left] != 0){
                        left++;
                    }
                    numKRemain++;
                    left++;
                }
            }
        }
        res = Math.max(res, (right - left));
        return res;
    }
}