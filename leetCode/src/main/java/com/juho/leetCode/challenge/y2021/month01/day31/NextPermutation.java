package com.juho.leetCode.challenge.y2021.month01.day31;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int first = nums.length;
        for(int i=nums.length-1; i>0; i--) {
            if(nums[i-1] < nums[i]) {
                first = i;
                break;
            }
        }
        if(first == nums.length) {
            Arrays.sort(nums);
            return;
        }
        
        for(int j=nums.length-1; j>=first; j--) {
            if(nums[j] > nums[first-1]) {
                swap(nums, first-1, j);
                break;
            }
        }
        Arrays.sort(nums, first, nums.length);
    }

    private void swap(int[] nums, int first, int second) {
        int temp = 0;
        temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
}
