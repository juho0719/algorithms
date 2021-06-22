package com.juho.leetCode.challenge.month06.day21;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i+1);
            while (row.size() <= i) row.add(1);
            int mid = i >> 1;
            for (int j = 1; j <= mid; j++) {
                int val = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                row.set(j, val);
                row.set(row.size()-j-1, val);
            }
            triangle.add(row);
        }               

        return triangle;
    }   
}