package com.juho.leetCode.challenge.y2021.month03.day23;

import java.util.Arrays;

public class ThreeSumWithMultiplicity {
    
    public int threeSumMulti(int[] arr, int target) {
        int MOD = 1_000_000_007;
        long ans = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; ++i) {
            int T = target - arr[i];
            int j = i+1, k = arr.length - 1;

            while (j < k) {
                if (arr[j] + arr[k] < T)
                    j++;
                else if (arr[j] + arr[k] > T)
                    k--;
                else if (arr[j] != arr[k]) {
                    int left = 1, right = 1;
                    while (j+1 < k && arr[j] == arr[j+1]) {
                        left++;
                        j++;
                    }
                    while (k-1 > j && arr[k] == arr[k-1]) {
                        right++;
                        k--;
                    }

                    ans += left * right;
                    ans %= MOD;
                    j++;
                    k--;
                } else {
                    ans += (k-j+1) * (k-j) / 2;
                    ans %= MOD;
                    break;
                }
            }
        }
        return (int) ans;
    }
}