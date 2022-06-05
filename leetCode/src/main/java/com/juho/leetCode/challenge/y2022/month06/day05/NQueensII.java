package com.juho.leetCode.challenge.y2022.month06.day05;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard 
 * such that no two queens attack each other.
 * Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * 
 * Example 1:
 * Input: n = 4
 * Output: 2
 * Explanation: There are two distinct solutions to the 4-queens puzzle as shown.
 * 
 * Example 2:
 * Input: n = 1
 * Output: 1
 * 
 * Constraints:
 * 1 <= n <= 9
 */

public class NQueensII {
    
    int ans;
    
    public int totalNQueens(int n) {
        ans = 0;
        place(0,0,0,0,n);
        return ans;
    }
    
    private void place(int i, int vert, int ldiag, int rdiag, int n) {
        if (i == n) ans++;
        else for (int j = 0; j < n; j++) {
            int vmask = 1 << j, lmask = 1 << (i+j), rmask = 1 << (n-i-1+j);
            if ((vert & vmask) + (ldiag & lmask) + (rdiag & rmask) > 0) continue;
            place(i+1, vert | vmask, ldiag | lmask, rdiag | rmask, n);
        }
    }
}