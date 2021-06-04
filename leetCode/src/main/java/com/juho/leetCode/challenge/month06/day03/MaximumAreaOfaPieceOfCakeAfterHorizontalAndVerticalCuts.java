package com.juho.leetCode.challenge.month06.day03;

import java.util.Arrays;

public class MaximumAreaOfaPieceOfCakeAfterHorizontalAndVerticalCuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxh = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length-1]),
            maxv = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length-1]);
        for (int i = 1; i < horizontalCuts.length; i++)
            maxh = Math.max(maxh, horizontalCuts[i] - horizontalCuts[i-1]);
        for (int i = 1; i < verticalCuts.length; i++)
            maxv = Math.max(maxv, verticalCuts[i] - verticalCuts[i-1]);
        return (int)((long)maxh * maxv % 1000000007);
    }
}