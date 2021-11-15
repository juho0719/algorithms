package com.juho.leetCode.challenge.month11.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of distinct positive integers nums, return the largest subset answer such that every pair (answer[i], answer[j]) of elements in this subset satisfies:
 * - answer[i] % answer[j] == 0, or
 * - answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them.
 * 
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [1,2]
 * Explanation: [1,3] is also accepted.
 * 
 * Example 2:
 * Input: nums = [1,2,4,8]
 * Output: [1,2,4,8]
 * 
 * Constraints:
 * 1 <= nums.length <= 1000
 * 1 <= nums[i] <= 2 * 10^9
 * All the integers in nums are unique.
 */
public class LargestDivisibleSubset {
    
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] l = new int[nums.length];
        int[] prev = new int[nums.length];

        Arrays.sort(nums);
        int max = 0;
        int index = -1;
        for (int i = 0; i < nums.length; i++){
            l[i] = 1;
            prev[i] = -1;
            for (int j = i - 1; j >= 0; j--){
                if (nums[i] % nums[j] == 0 && l[j] + 1 > l[i]){
                    l[i] = l[j] + 1;
                    prev[i] = j;
                }
            }
            if (l[i] > max){
                max = l[i];
                index = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (index != -1){
            res.add(nums[index]);
            index = prev[index];
        }
        return res;
    }
}