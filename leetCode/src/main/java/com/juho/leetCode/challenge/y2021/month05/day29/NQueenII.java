package com.juho.leetCode.challenge.y2021.month05.day29;

public class NQueenII {
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
