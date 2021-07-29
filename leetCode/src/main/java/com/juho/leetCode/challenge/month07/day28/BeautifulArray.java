package com.juho.leetCode.challenge.month07.day28;

import java.util.HashMap;
import java.util.Map;

public class BeautifulArray {
    Map<Integer, int[]> memo;
    public int[] beautifulArray(int nums) {
        memo = new HashMap<>();
        return f(nums);
    }

    public int[] f(int nums) {
        if (memo.containsKey(nums))
            return memo.get(nums);

        int[] ans = new int[nums];
        if (nums == 1) {
            ans[0] = 1;
        } else {
            int t = 0;
            for (int x: f((nums+1)/2))  // odds
                ans[t++] = 2*x - 1;
            for (int x: f(nums/2))  // evens
                ans[t++] = 2*x;
        }
        memo.put(nums, ans);
        return ans;
    }
}