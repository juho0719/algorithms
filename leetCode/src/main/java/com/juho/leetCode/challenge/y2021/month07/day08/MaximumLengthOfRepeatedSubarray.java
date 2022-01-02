package com.juho.leetCode.challenge.y2021.month07.day08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLengthOfRepeatedSubarray {
    int P = 113;
    int MOD = 1_000_000_007;
    int Pinv = BigInteger.valueOf(P).modInverse(BigInteger.valueOf(MOD)).intValue();

    private int[] rolling(int[] source, int length) {
        int[] ans = new int[source.length - length + 1];
        long h = 0, power = 1;
        if (length == 0) return ans;
        for (int i = 0; i < source.length; ++i) {
            h = (h + source[i] * power) % MOD;
            if (i < length - 1) {
                power = (power * P) % MOD;
            } else {
                ans[i - (length - 1)] = (int) h;
                h = (h - source[i - (length - 1)]) * Pinv % MOD;
                if (h < 0) h += MOD;
            }
        }
        return ans;
    }

    private boolean check(int guess, int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> hashes = new HashMap<>();
        int k = 0;
        for (int x: rolling(nums1, guess)) {
            hashes.computeIfAbsent(x, z -> new ArrayList<>()).add(k++);
        }
        int j = 0;
        for (int x: rolling(nums2, guess)) {
            for (int i: hashes.getOrDefault(x, new ArrayList<Integer>()))
                if (Arrays.equals(Arrays.copyOfRange(nums1, i, i+guess),
                                  Arrays.copyOfRange(nums2, j, j+guess))) {
                    return true;
                }
            j++;
        }
        return false;
    }

    public int findLength(int[] nums1, int[] nums2) {
        int lo = 0, hi = Math.min(nums1.length, nums2.length) + 1;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (check(mi, nums1, nums2)) lo = mi + 1;
            else hi = mi;
        }
        return lo - 1;
    }
}