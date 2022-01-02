package com.juho.leetCode.challenge.y2021.month12.day03;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array 
 * that has the largest product, and return the product.
 * It is guaranteed that the answer will fit in a 32-bit integer.
 * A subarray is a contiguous subsequence of the array.
 * 
 * Example 1:
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * 
 * Example 2:
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 * Constraints:
 * 1 <= nums.length <= 2 * 10^4
 * -10 <= nums[i] <= 10
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int l=1,r=1;
        int ans=nums[0];
        
        for(int i=0;i<n;i++){
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;
            
            l *= nums[i];
            r *= nums[n-1-i];
            ans = Math.max(ans,Math.max(l,r));
        }
        return ans;
    }
}