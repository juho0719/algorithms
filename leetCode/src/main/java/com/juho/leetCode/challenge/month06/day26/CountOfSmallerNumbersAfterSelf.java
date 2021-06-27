package com.juho.leetCode.challenge.month06.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        
        // remap the numbers to whole numbers range
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i : nums) {
            map.put(i, 0);
        }
        int val = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            map.put(entry.getKey(), val);
            val++;
        }
        int arr[] = new int[n];
        for(int i =0 ; i < n; i++) {
            arr[i] = map.get(nums[i]);
        }
        
        // making fenwick tree
        int fen[] = new int[val];
        int ans[] = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            ans[i] = find(fen, arr[i] - 1);
            update(fen, arr[i], 1);
        }
        
        // converting our answer array to list
        List<Integer> list = new ArrayList<>();
        for(int i : ans) {
            list.add(i);
        }
        return list;
    }
    
    private int find(int fen[], int x) {
        if(x < 0) return 0;
        int i = x + 1;
        int sum = 0;
        while(i > 0) {
            sum += fen[i - 1];
            i -= (i & (-i));
        }
        return sum;
    }
    
    private void update(int fen[], int x, int val) {
        int i = x + 1;
        int n = fen.length;
        while (i <= n) {
            fen[i - 1] += val;
            i += (i & (-i));
        }
    }
}