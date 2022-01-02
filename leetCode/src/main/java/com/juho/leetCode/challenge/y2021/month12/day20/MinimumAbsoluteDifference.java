package com.juho.leetCode.challenge.y2021.month12.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements. 
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 * - a, b are from arr
 * - a < b
 * - b - a equals to the minimum absolute difference of any two elements in arr
 * 
 * Example 1:
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 * 
 * Example 2:
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 * 
 * Example 3:
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 * 
 * Constraints:
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 */
public class MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minElement = arr[0];
        int maxElement = arr[0];
        for (int num : arr) {
            minElement = Math.min(minElement, num);
            maxElement = Math.max(maxElement, num);
        }
        int shift = -minElement;
        int[] line = new int[maxElement - minElement + 1];
        List<List<Integer>> answer = new ArrayList<>();
        for (int num : arr) {
            line[num + shift] = 1;
        }
        
        int minPairDiff = maxElement - minElement;
        int prev = 0;
        for (int curr = 1; curr <= maxElement + shift; ++curr) {
            if (line[curr] == 0) {
                continue;
            }
            
            if (curr - prev == minPairDiff) {       
                answer.add(Arrays.asList(prev - shift, curr - shift));
            } else if (curr - prev < minPairDiff) {
                answer = new ArrayList<>();
                minPairDiff = curr - prev;
                answer.add(Arrays.asList(prev - shift, curr - shift));                
            } 
            prev = curr;
        }  
        return answer;
    }
}