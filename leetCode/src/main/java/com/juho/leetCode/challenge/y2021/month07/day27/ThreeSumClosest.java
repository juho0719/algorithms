package com.juho.leetCode.challenge.y2021.month07.day27;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, sz = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < sz && diff != 0; ++i) {
            int lo = i + 1, hi = sz - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if (sum < target)
                    ++lo;
                else
                    --hi;
            }
        }
        return target - diff;
    }
}