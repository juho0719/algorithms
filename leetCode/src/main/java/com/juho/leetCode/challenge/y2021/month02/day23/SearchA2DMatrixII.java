package com.juho.leetCode.challenge.y2021.month02.day23;

public class SearchA2DMatrixII {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target) return true;
            if(matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
