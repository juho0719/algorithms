package com.juho.leetCode.challenge.y2022.month03.day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are given an integer array nums. You want to maximize the number of points you get by performing the following operation any number of times:
 * Pick any nums[i] and delete it to earn nums[i] points. Afterwards, 
 * you must delete every element equal to nums[i] - 1 and every element equal to nums[i] + 1.
 * Return the maximum number of points you can earn by applying the above operation some number of times.
 * 
 * Example 1:
 * Input: nums = [3,4,2]
 * Output: 6
 * Explanation: You can perform the following operations:
 * - Delete 4 to earn 4 points. Consequently, 3 is also deleted. nums = [2].
 * - Delete 2 to earn 2 points. nums = [].
 * You earn a total of 6 points.
 * 
 * Example 2:
 * Input: nums = [2,2,3,3,3,4]
 * Output: 9
 * Explanation: You can perform the following operations:
 * - Delete a 3 to earn 3 points. All 2's and 4's are also deleted. nums = [3,3].
 * - Delete a 3 again to earn 3 points. nums = [3].
 * - Delete a 3 once more to earn 3 points. nums = [].
 * You earn a total of 9 points.
 * 
 * Constraints:
 * 1 <= nums.length <= 2 * 10^4
 * 1 <= nums[i] <= 10^4
 */

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        Map<Integer, Integer> points = new HashMap<>();
        
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }
        
        int twoBack = 0;
        int oneBack = 0;
        int n = points.size();
        
        if (maxNumber < n + n * Math.log(n) / Math.log(2)) {
            oneBack = points.getOrDefault(1, 0);
            for (int num = 2; num <= maxNumber; num++) {
                int temp = oneBack;
                oneBack = Math.max(oneBack, twoBack + points.getOrDefault(num, 0));
                twoBack = temp;
            }
        } else {
            List<Integer> elements = new ArrayList<>(points.keySet());
            Collections.sort(elements);
            oneBack = points.get(elements.get(0));
        
            for (int i = 1; i < elements.size(); i++) {
                int currentElement = elements.get(i);
                int temp = oneBack;
                if (currentElement == elements.get(i - 1) + 1) {
                    oneBack = Math.max(oneBack, twoBack + points.get(currentElement));
                } else {
                    oneBack += points.get(currentElement);
                }
                twoBack = temp;
            }
        }
        return oneBack;
    }
}