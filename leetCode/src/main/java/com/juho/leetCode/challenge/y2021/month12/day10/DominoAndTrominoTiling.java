package com.juho.leetCode.challenge.y2021.month12.day10;

/**
 * You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
 * Given an integer n, return the number of ways to tile an 2 x n board. 
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * In a tiling, every square must be covered by a tile. 
 * Two tilings are different if and only if there are two 4-directionally adjacent cells on the board 
 * such that exactly one of the tilings has both squares occupied by a tile.
 * 
 * Example 1:
 * Input: n = 3
 * Output: 5
 * Explanation: The five different ways are show above.
 * 
 * Example 2:
 * Input: n = 1
 * Output: 1
 * 
 * Constraints:
 * 1 <= n <= 1000
 */
public class DominoAndTrominoTiling {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if (n <= 2) {
            return n;
        }
        long fCurrent = 5L;
        long fPrevious = 2;
        long fBeforePrevious = 1;
        for (int k = 4; k < n + 1; ++k) {
            long tmp = fPrevious;
            fPrevious = fCurrent;
            fCurrent = (2 * fCurrent + fBeforePrevious) % MOD;
            fBeforePrevious = tmp;
        }
        return (int) (fCurrent % MOD);
    }
}