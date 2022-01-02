package com.juho.leetCode.challenge.month03.day11;

import java.util.Arrays;

public class CoinChange {
    int ans;
    public int coinChange(int[] C, int A) {
        ans = 10001;
        Arrays.sort(C);
        rc(A, 0, C.length-1, C);
        return ans < 10001 ? ans : -1;
    }
    void rc(int amt, int num, int cix, int[] C) {
        if (amt == 0) ans = Math.min(num, ans);
        else if (amt > 0 && cix >= 0) {
            int n = amt / C[cix];
            if (n + num >= ans) return;
            while (n >= 0) rc(amt - n * C[cix], num + n--, cix - 1, C);
        }
    }
}