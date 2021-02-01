package com.juho.leetCode.jenuaryLeetCodingChallenge.day18;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int result = 0;
        int left = 0, right = nums.length-1;
        while(left < right) {
            if(nums[right] >= k || nums[left] + nums[right] > k) {
                right--;
            } else if(nums[left] + nums[right] < k) {
                left++;
            } else {
                result++;
                left++;
                right--;
            }
        }
        return result;
    }
}