package com.juho.leetCode.challenge.y2021.month08.day02;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int b = nums[i], a = target - b;
            if (seen.containsKey(a)) return new int[]{seen.get(a), i}; 
            seen.put(b, i);
        }
        return new int[]{};
    }
}