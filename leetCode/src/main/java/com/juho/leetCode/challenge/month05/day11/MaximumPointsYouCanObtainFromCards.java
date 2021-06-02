package com.juho.leetCode.challenge.month05.day11;

public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int begin = 0;
        int end = 0;
        int max = 0;
        for(int i=0; i<k; i++) {
            begin += cardPoints[i];
        }
        end = begin;
        max = begin;
        for(int j=0; j<k; j++) {
            end -= cardPoints[k-1-j];
            end += cardPoints[cardPoints.length-1-j];
            max = Math.max(end, max);
        }
        return max;
    }
}