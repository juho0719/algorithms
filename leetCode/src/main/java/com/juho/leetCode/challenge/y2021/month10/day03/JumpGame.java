package com.juho.leetCode.challenge.y2021.month10.day03;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length, lastIndx = n-1; 
        for(int indx = n-1; indx>=0; indx--){
           if(nums[indx] + indx >= lastIndx){
               lastIndx = indx;
           }
        }
        return lastIndx == 0;
    }
}