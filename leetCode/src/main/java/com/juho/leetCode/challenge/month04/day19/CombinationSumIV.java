package com.juho.leetCode.challenge.month04.day19;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) dp[i] += dp[i-num];
            }
        }
        return dp[target];
    }
}