package com.juho.leetCode.challenge.y2021.month04.day15;

public class FibonacciNumbers {
    Integer[] caches = new Integer[31];

    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        caches[0] = 0;
        caches[1] = 1;
        return memorize(n);
    }

    private int memorize(int n) {
        if(caches[n] != null) {
            return caches[n];
        }
        caches[n] = memorize(n-1) + memorize(n-2);;
        return caches[n];
    }
}