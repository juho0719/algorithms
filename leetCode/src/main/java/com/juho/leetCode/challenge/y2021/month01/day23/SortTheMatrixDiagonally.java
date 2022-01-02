package com.juho.leetCode.challenge.y2021.month01.day23;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortTheMatrixDiagonally {

    public int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                map.computeIfAbsent(i-j, (key) -> new PriorityQueue<>()).add(mat[i][j]);
            }
        }

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                mat[i][j] = map.get(i-j).poll();
            }
        }

        return mat;
    }
}
