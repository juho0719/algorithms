package com.juho.leetCode.mayLeetCodingChallenge.day08;

public class SuperPalindromes {
    public int superpalindromesInRange(String left, String right) {
        long l = Long.valueOf(left);
        long r = Long.valueOf(right);
        int MAGIC = 100000;
        int ans = 0;

        // count odd length;
        for (int k = 1; k < MAGIC; ++k) {
            StringBuilder sb = new StringBuilder(Integer.toString(k));
            for (int i = sb.length() - 2; i >= 0; --i)
                sb.append(sb.charAt(i));
            long v = Long.valueOf(sb.toString());
            v *= v;
            if (v > r) break;
            if (v >= l && isPalindrome(v)) ans++;
        }

        // count even length;
        for (int k = 1; k < MAGIC; ++k) {
            StringBuilder sb = new StringBuilder(Integer.toString(k));
            for (int i = sb.length() - 1; i >= 0; --i)
                sb.append(sb.charAt(i));
            long v = Long.valueOf(sb.toString());
            v *= v;
            if (v > r) break;
            if (v >= l && isPalindrome(v)) ans++;
        }

        return ans;
    }

    private boolean isPalindrome(long x) {
        return x == reverse(x);
    }

    private long reverse(long x) {
        long ans = 0;
        while (x > 0) {
            ans = 10 * ans + x % 10;
            x /= 10;
        }

        return ans;
    }
}