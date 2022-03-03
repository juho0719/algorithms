package com.juho.leetCode.challenge.y2022.month03.day03;

/**
 * An integer array is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 * For example, [1,3,5,7,9], [7,7,7,7], and [3,-1,-5,-9] are arithmetic sequences.
 * Given an integer array nums, return the number of arithmetic subarrays of nums.
 * A subarray is a contiguous subsequence of the array.
 * 
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: 3
 * Explanation: We have 3 arithmetic slices in nums: [1, 2, 3], [2, 3, 4] and [1,2,3,4] itself.
 * 
 * Example 2:
 * Input: nums = [1]
 * Output: 0
 * 
 * Constraints:
 * 1 <= nums.length <= 5000
 * -1000 <= nums[i] <= 1000
 */

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length ;
        if(n < 3) return 0;
        int count = 0;
        int dp = 0;

        for(int i=1; i<n-1; i++) {
            if(nums[i-1]-nums[i] == nums[i]-nums[i+1]) {
                dp += 1;
                count += dp;
            } else {
                dp = 0;
            }
        }
        return count;
    }
}