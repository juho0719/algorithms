package com.juho.leetCode.decemberLeetCodingChallenge.day26;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {

    int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
    public int minimumEffortPath(int[][] heights) {    
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> (x[0]-y[0]));
        int[][] weights = new int[m][n];
        for(int[] weight : weights) {
            Arrays.fill(weight, Integer.MAX_VALUE);
        }
        pq.offer(new int[]{0,0,0});
        weights[0][0] = 0;

        while(!pq.isEmpty()) {
            int[] field = pq.poll();
            int cost = field[0];
            int row = field[1];
            int col = field[2];
            if(row == m-1 && col == n-1) return cost;

            visited[row][col] = true;
            for(int[] d : dir) {
                int nextRow = row + d[0];
                int nextCol = col + d[1];
                if(nextRow >= 0 && nextRow < m && nextCol >= 0 && nextCol < n && !visited[nextRow][nextCol]) {
                    int maxCost = Math.max(Math.abs(heights[row][col] - heights[nextRow][nextCol]), weights[row][col]);
                    if(maxCost < weights[nextRow][nextCol]) {
                        weights[nextRow][nextCol] = maxCost;
                        pq.add(new int[]{weights[nextRow][nextCol], nextRow, nextCol});
                    } 
                }
            }
        }

        return weights[m-1][n-1];
    }
}
