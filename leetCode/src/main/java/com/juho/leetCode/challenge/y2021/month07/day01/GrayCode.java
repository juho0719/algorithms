package com.juho.leetCode.challenge.y2021.month07.day01;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        grayCodeHelper(result, n);
        return result;
    }

    private void grayCodeHelper(List<Integer> result, int n) {
        if (n == 0) {
            result.add(0);
            return;
        }
        
        grayCodeHelper(result, n - 1);
        int currentSequenceLength = result.size();
        int mask = 1 << (n - 1);
        for (int i = currentSequenceLength - 1; i >= 0; i--) {
            result.add(result.get(i) | mask);
        }
    }
}