package com.juho.leetCode.challenge.y2021.month07.day07;

public class KthSmallestElementInASortedMatrix {
    int m, n;
    public int kthSmallest(int[][] matrix, int k) {
        m = matrix.length; n = matrix[0].length;
        int left = matrix[0][0], right = matrix[m-1][n-1], ans = -1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (countLessOrEqual(matrix, mid) >= k) {
                ans = mid;
                right = mid - 1; 
            } else left = mid + 1;
        }
        return ans;
    }
    private int countLessOrEqual(int[][] matrix, int x) {
        int cnt = 0, c = n - 1; 
        for (int r = 0; r < m; ++r) {
            while (c >= 0 && matrix[r][c] > x) --c; 
            cnt += (c + 1);
        }
        return cnt;
    }
}