package com.juho.leetCode.challenge.y2022.month03.day04;

/**
 * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, 
 * and so on until the 100th row.  Each glass holds one cup of champagne.
 * Then, some champagne is poured into the first glass at the top.  When the topmost glass is full, 
 * any excess liquid poured will fall equally to the glass immediately to the left and right of it.  
 * When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.  
 * (A glass at the bottom row has its excess champagne fall on the floor.)
 * For example, after one cup of champagne is poured, the top most glass is full.  
 * After two cups of champagne are poured, the two glasses on the second row are half full.  
 * After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.  
 * After four cups of champagne are poured, the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.
 * Now after pouring some non-negative integer cups of champagne, return how full the jth glass in the ith row is (both i and j are 0-indexed.)
 * 
 * Example 1:
 * Input: poured = 1, queryRow = 1, queryGlass = 1
 * Output: 0.00000
 * Explanation: We poured 1 cup of champange to the top glass of the tower (which is indexed as (0, 0)). 
 * There will be no excess liquid so all the glasses under the top glass will remain empty.
 * 
 * Example 2:
 * Input: poured = 2, queryRow = 1, queryGlass = 1
 * Output: 0.50000
 * Explanation: We poured 2 cups of champange to the top glass of the tower (which is indexed as (0, 0)). 
 * There is one cup of excess liquid. The glass indexed as (1, 0) and the glass indexed as (1, 1) will share the excess liquid equally, 
 * and each will get half cup of champange.
 * 
 * Example 3:
 * Input: poured = 100000009, queryRow = 33, queryGlass = 17
 * Output: 1.00000
 * 
 * Constraints:
 * 0 <= poured <= 10^9
 * 0 <= query_glass <= queryRow < 100
 */

public class ChampagneTower {
    public double champagneTower(int poured, int queryRow, int queryGlass) {
        double[][] A = new double[102][102];
        A[0][0] = (double) poured;
        for (int r = 0; r <= queryRow; ++r) {
            for (int c = 0; c <= r; ++c) {
                double q = (A[r][c] - 1.0) / 2.0;
                if (q > 0) {
                    A[r+1][c] += q;
                    A[r+1][c+1] += q;
                }
            }
        }

        return Math.min(1, A[queryRow][queryGlass]);
    }
}