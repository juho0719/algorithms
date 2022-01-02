package com.juho.leetCode.challenge.y2021.month12.day11;

/**
 * A positive integer is magical if it is divisible by either a or b.
 * Given the three integers n, a, and b, return the nth magical number. 
 * Since the answer may be very large, return it modulo 10^9 + 7.
 * 
 * Example 1:
 * Input: n = 1, a = 2, b = 3
 * Output: 2
 * 
 * Example 2:
 * Input: n = 4, a = 2, b = 3
 * Output: 6
 * 
 * Example 3:
 * Input: n = 5, a = 2, b = 4
 * Output: 10
 * 
 * Example 4:
 * Input: n = 3, a = 6, b = 4
 * Output: 8
 * 
 * Constraints:
 * 1 <= n <= 10^9
 * 2 <= a, b <= 4 * 10^4
 */
public class NthMagicalNumber {
    public int nthMagicalNumber(int n, int a, int b) {
        int MOD = 1_000_000_007;
        int l = a / gcd(a, b) * b;
        int m = l / a + l / b - 1;
        int q = n / m, r = n % m;

        long ans = (long) q * l % MOD;
        if (r == 0)
            return (int) ans;

        int[] heads = new int[]{a, b};
        for (int i = 0; i < r - 1; ++i) {
            if (heads[0] <= heads[1])
                heads[0] += a;
            else
                heads[1] += b;
        }

        ans += Math.min(heads[0], heads[1]);
        return (int) (ans % MOD);
    }

    public int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }
}