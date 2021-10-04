package com.juho.leetCode.challenge.month10.day04;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0)    return 0;
        int perimeter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;
                    if(i > 0 && grid[i-1][j] == 1){
                        perimeter -= 2;
                    }
                    if(j > 0 && grid[i][j-1] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}