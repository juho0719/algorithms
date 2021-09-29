package com.juho.leetCode.challenge.month09.day28;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < n && right >= 0) {
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 2;
                right -= 2;
            } else if (nums[left] % 2 == 1 && nums[right] % 2 == 1) {
                right -= 2;
            } else if (nums[left] % 2 == 0 && nums[right] % 2 == 0) {
                left += 2;
            } else {
                left += 2;
                right -= 2;
            }
        }
        return nums;
    }
}