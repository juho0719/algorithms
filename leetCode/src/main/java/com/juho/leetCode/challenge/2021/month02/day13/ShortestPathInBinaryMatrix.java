package com.juho.leetCode.challenge.month02.day13;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1; 
        
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        // directional vector
        int[] dx = new int[]{1, 1, 0, -1, -1, -1, 0, 1};
        int[] dy = new int[]{0, 1, 1, 1, 0, -1, -1, -1};

        // start cell
        queue.add(new int[]{0,0});
        visited[0][0] = true;
        int level = 1;

        while(queue.size() > 0) {
            for(int i=queue.size(); i>0; i--) {
                int[] xy = queue.poll();
                if(xy[0] == m - 1 && xy[1] == n - 1) return level;
                
                for(int j=0; j<8; j++) {
                    int nx = xy[0] + dx[j];
                    int ny = xy[1] + dy[j];
                    if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && grid[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
            level++;
        }
        
        return -1;
    }
}
