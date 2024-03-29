package com.juho.leetCode.challenge.y2021.month09.day30;

public class PartitionToKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int i = nums.length - 1; i >= 0; i--)  sum += nums[i];
        if ((sum % k) != 0)  return false;
        
        int target = sum / k;
        return dfs(k, 0, 0, nums, target);
    }
    
    
    private boolean dfs(int kRemainingToFill, int curSum, int numsIdx, int[] nums, int target) {
        if (kRemainingToFill <= 0)  return true;
        for (int i = numsIdx; i < nums.length; i++) {
            if (nums[i] != 0 && curSum + nums[i] <= target) {
                int temp = nums[i];
                nums[i] = 0;
                if (curSum + temp == target) {
                    if (dfs(kRemainingToFill - 1, 0, 0, nums, target))  return true;
                } else {
                    if (dfs(kRemainingToFill, curSum + temp, i + 1, nums, target))  return true;
                }
                nums[i] = temp;
            } 
        }
        return false;
    }
}