package com.juho.leetCode.challenge.y2021.month06.day19;

public class KInversePairsArray {
    public int kInversePairs(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        int MODULO = 1000000007;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k && j <= i * (i - 1) / 2; j++) {
                if (i == 1 && j == 0) {
                    dp[i][j] = 1;
                    break;
                } else if (j == 0)
                    dp[i][j] = 1;
                else {
                    int val = (dp[i - 1][j] + MODULO - ((j - i) >= 0 ? dp[i - 1][j - i] : 0)) % MODULO;
                    dp[i][j] = (dp[i][j - 1] + val) % MODULO;
                }
            }
        }
        return dp[n][k];
    }
}