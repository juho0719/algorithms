package com.juho.leetCode.challenge.month11.day11;


/**
 * Given an array of integers nums, you start with an initial positive value startValue.
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 * 
 * Example 1:
 * Input: nums = [-3,2,-3,4,2]
 * Output: 5
 * Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
 * 
 * Example 2:
 * Input: nums = [1,2]
 * Output: 1
 * Explanation: Minimum start value should be positive. 
 * 
 * Example 3:
 * Input: nums = [1,-2,-3]
 * Output: 5
 * 
 * Constraints:
 * 1 <= nums.length <= 100
 * -100 <= nums[i] <= 100
 */
public class MinimumValueToGetPositiveStepByStepSum {
    public int minStartValue(int[] nums) {
        int minVal = 0;
        int total = 0;

        for (int num : nums) {
            total += num;
            minVal = Math.min(minVal, total);
        }
        return -minVal + 1;
    }
}