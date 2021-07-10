package com.juho.leetCode.challenge.month07.day09;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        List<Integer> sublist = new ArrayList<>();
        sublist.add(nums[0]);
    
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            if (curr > sublist.get(sublist.size() - 1)) {
                sublist.add(curr);
            } else {
                int positionToInsert = binarySearch(sublist, curr);
                sublist.set(positionToInsert, curr);
            }
        }
    
        return sublist.size();
    }
    
    private int binarySearch(List<Integer> sublist, int curr) {
        int left = 0, right = sublist.size() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sublist.get(mid) == curr) {
                return mid;
            }
            if (sublist.get(mid) > curr) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}