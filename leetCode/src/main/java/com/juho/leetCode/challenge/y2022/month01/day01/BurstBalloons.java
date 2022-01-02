package com.juho.leetCode.challenge.y2022.month01.day01;

/**
 * You are given n balloons, indexed from 0 to n - 1. 
 * Each balloon is painted with a number on it represented by an array nums. 
 * You are asked to burst all the balloons.
 * If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. 
 * If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.
 * Return the maximum coins you can collect by bursting the balloons wisely.
 * 
 * Example 1:
 * Input: nums = [3,1,5,8]
 * Output: 167
 * Explanation:
 * nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
 * coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
 * 
 * Example 2:
 * Input: nums = [1,5]
 * Output: 10
 * 
 * Constraints:
 * n == nums.length
 * 1 <= n <= 500
 * 0 <= nums[i] <= 100
 */
public class BurstBalloons {
    public int rob(int[] nums) {
        int n =  nums.length;
        int arr[] =  new int[n+2]; 
        for(int i=0;i<n;i++){
            arr[i+1] = nums[i];
        }
        arr[0]=1;arr[n+1] =  1;
        int dp[][]  = new int[n+2][n+2];
        for(int wlen=1;wlen<=n;wlen++ ){
            for(int left =  1;left<=n-wlen+1;left++){
                int right =  left+wlen-1;
                for(int k=left;k<=right;k++){
                    dp[left][right]  = 
                        Math.max(dp[left][right],
                                dp[left][k-1]+dp[k+1][right]+(arr[k]*arr[left-1]*arr[right+1])
                        );                                    
                }                                                
            }
        }
        
         return dp[1][n];
    }
}