package com.juho.leetCode.challenge.month11.day20;

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.
 *
 * Example 1:
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10
 * 
 * Constraints:
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^5
 */
public class SingleElementInaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int l = 0;
        int h = nums.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(nums[mid]==nums[mid+1]) mid = mid-1;
            if((mid-l+1)%2!=0) h = mid;
            
            else l = mid+1;
        }
        return nums[l];
    }
}