package com.juho.leetCode.challenge.y2022.month04.day09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 * 
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * 
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 * 
 * Constraints:
 * 1 <= nums.length <= 10^5
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 */

public class TopKFrequentElements {
    int[] unique;
    Map<Integer, Integer> count;

    public void swap(int a, int b) {
        int tmp = unique[a];
        unique[a] = unique[b];
        unique[b] = tmp;
    }

    public int partition(int left, int right, int pivot_index) {
        int pivot_frequency = count.get(unique[pivot_index]);
        swap(pivot_index, right);
        int store_index = left;
        for (int i = left; i <= right; i++) {
            if (count.get(unique[i]) < pivot_frequency) {
                swap(store_index, i);
                store_index++;
            }
        }
        swap(store_index, right);
        return store_index;
    }
    
    public void quickselect(int left, int right, int k_smallest) {
        if (left == right) return;
        
        Random random_num = new Random();
        int pivot_index = left + random_num.nextInt(right - left); 
        pivot_index = partition(left, right, pivot_index);
        if (k_smallest == pivot_index) {
            return;    
        } else if (k_smallest < pivot_index) {
            quickselect(left, pivot_index - 1, k_smallest);     
        } else {
            quickselect(pivot_index + 1, right, k_smallest);  
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        count = new HashMap<>();
        for (int num: nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int n = count.size();
        unique = new int[n]; 
        int i = 0;
        for (int num: count.keySet()) {
            unique[i] = num;
            i++;
        }
        quickselect(0, n - 1, n - k);
        return Arrays.copyOfRange(unique, n - k, n);
    }
}