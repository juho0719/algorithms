package com.juho.leetCode.decemberLeetCodingChallenge.day16;

public class KthLargestElementInAnArray {
    
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}