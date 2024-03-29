package com.juho.leetCode.challenge.y2021.month03.day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1_000_000_007;
        int length = arr.length;
        Arrays.sort(arr);
        long[] dp = new long[length];
        Arrays.fill(dp, 1);

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < length; ++i)
            index.put(arr[i], i);

        for (int i = 0; i < length; ++i)
            for (int j = 0; j < i; ++j) {
                if (arr[i] % arr[j] == 0) { // arr[j] is left child
                    int right = arr[i] / arr[j];
                    if (index.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[index.get(right)]) % MOD;
                    }
                }
            }

        long ans = 0;
        for (long x: dp) ans += x;
        return (int) (ans % MOD);
    }
}