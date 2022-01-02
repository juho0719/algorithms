package com.juho.leetCode.challenge.y2021.month02.day15;

import java.util.PriorityQueue;
import java.util.Queue;

public class TheKWeakestRowsInAMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);
        
        for(int i=0; i<mat.length; i++) {
            int count = 0;
            for(int j=0; j<mat[0].length; j++) {
                if(mat[i][j] == 1) count++;
            }
            queue.offer(new int[]{i, count});
        }
        
        int[] result = new int[k];
        for(int l=0; l<k; l++) {
            result[l] = queue.poll()[0];
        }
        return result;
    }
}
