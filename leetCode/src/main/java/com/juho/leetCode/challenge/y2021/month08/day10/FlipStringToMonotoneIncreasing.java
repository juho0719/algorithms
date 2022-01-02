package com.juho.leetCode.challenge.y2021.month08.day10;

public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int N = s.length();
        int[] P = new int[N + 1];
        for (int i = 0; i < N; ++i)
            P[i+1] = P[i] + (s.charAt(i) == '1' ? 1 : 0);

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= N; ++j) {
            ans = Math.min(ans, P[j] + N-j-(P[N]-P[j]));
        }

        return ans;
    }
}