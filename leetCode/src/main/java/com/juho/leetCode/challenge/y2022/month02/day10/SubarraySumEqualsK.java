package com.juho.leetCode.challenge.y2022.month02.day10;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k
 * 
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * 
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 * 
 * Constraints:
 * 1 <= nums.length <= 2 * 10^4
 * -1000 <= nums[i] <= 1000
 * -10^7 <= k <= 10^7
 */

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map <Integer, Integer> map = new HashMap<> ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}