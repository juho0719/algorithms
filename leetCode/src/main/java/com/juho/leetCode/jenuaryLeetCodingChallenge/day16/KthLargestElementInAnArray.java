package com.juho.leetCode.jenuaryLeetCodingChallenge.day16;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}