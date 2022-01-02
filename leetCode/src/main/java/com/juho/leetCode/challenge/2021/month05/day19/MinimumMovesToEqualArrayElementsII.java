package com.juho.leetCode.challenge.month05.day19;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, median = nums[nums.length / 2];
        for (int num : nums) ans += Math.abs(median - num);
        return ans;
    }
}
