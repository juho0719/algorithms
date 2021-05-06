package com.juho.leetCode.mayLeetCodingChallenge.day05;

public class JumpGame2 {
    public int jump(int[] nums) {
        int len = nums.length - 1;
        int cur = -1;
        int next = 0;
        int result = 0;
        for (int i = 0; next < len; i++) {
            if (i > cur) {
                result++;
                cur = next;
            }
            next = Math.max(next, nums[i] + i);
        }
        return result;
    }
}