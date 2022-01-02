package com.juho.leetCode.challenge.y2021.month06.day17;

public class NumberOfSubarraysWithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0, low = 0, mid = 0;
        for (int num : nums) {
            if (num > right) mid = 0;
            else ans += ++mid;
            if (num >= left) low = 0;
            else ans -= ++low;
        }
        return ans;
    }
}