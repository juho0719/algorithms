package com.juho.leetCode.decemberLeetCodingChallenge.day14;

public class MinimumOperationsToReduceXtoZero {
    
    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;
        int n = nums.length;
        int windowSize = -1;
        int current = 0;

        for (int right = 0, left = 0; right < n; right++) {
            current += nums[right];
            while (current > target && left <= right)
                current -= nums[left++];

            if (current == target)
                windowSize = Math.max(windowSize, right - left + 1);
        }
        return windowSize != -1 ? n - windowSize : -1;
    }
}