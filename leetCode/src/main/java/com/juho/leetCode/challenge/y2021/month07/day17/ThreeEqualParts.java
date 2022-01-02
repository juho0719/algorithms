package com.juho.leetCode.challenge.y2021.month07.day17;

import java.util.Arrays;

public class ThreeEqualParts {

    private static final int[] IMPOSSIBLE = new int[] {-1, -1};
    public int[] threeEqualParts(int[] arr) {
        int n = arr.length;
        int totalOnes = 0;
        for (int bit : arr) {
            totalOnes += bit;
        }
        
        if (totalOnes % 3 != 0) {
            return IMPOSSIBLE;
        }
        
        int targetOnes = totalOnes / 3;
        if (targetOnes == 0) {
            return new int[] {0, n - 1};
        }

        int i1 = -1, j1 = -1, i2 = -1, j2 = -1, i3 = -1, j3 = -1;
        int oneCount = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == 1) {
                oneCount += 1;
                if (oneCount == 1) i1 = i;
                if (oneCount == targetOnes) j1 = i;
                if (oneCount == targetOnes + 1) i2 = i;
                if (oneCount == 2 * targetOnes) j2 = i;
                if (oneCount == 2 * targetOnes + 1) i3 = i;
                if (oneCount == 3 * targetOnes) j3 = i;
            }
        }

        int[] part1 = Arrays.copyOfRange(arr, i1, j1 + 1);
        int[] part2 = Arrays.copyOfRange(arr, i2, j2 + 1);
        int[] part3 = Arrays.copyOfRange(arr, i3, j3 + 1);

        if (!Arrays.equals(part1, part2) || !Arrays.equals(part1, part3)) {
            return IMPOSSIBLE;
        }

        int trailingZerosLeft = i2 - j1 - 1;
        int trailingZerosMid = i3 - j2 - 1;
        int trailingZeros = n - j3 - 1;

        if (trailingZeros > Math.min(trailingZerosLeft, trailingZerosMid)) {
            return IMPOSSIBLE;
        }
        return new int[] {j1 + trailingZeros, j2 + trailingZeros + 1};
    }
}