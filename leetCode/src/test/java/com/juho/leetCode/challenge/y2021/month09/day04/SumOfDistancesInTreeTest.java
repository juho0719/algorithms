package com.juho.leetCode.challenge.y2021.month09.day04;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SumOfDistancesInTreeTest {

    SumOfDistancesInTree sdt = new SumOfDistancesInTree();

    @Test
    public void sumOfDistancesInTree01Test() {
        int n01 = 6;
        int[][] edges01 = {{0,1},{0,2},{2,3},{2,4},{2,5}};
        int[] result01 = {8,12,6,10,10,10};
        assertArrayEquals(result01, sdt.sumOfDistancesInTree(n01, edges01));

        int n02 = 1;
        int[][] edges02 = {};
        int[] result02 = {0};
        assertArrayEquals(result02, sdt.sumOfDistancesInTree(n02, edges02));
        
        int n03 = 2;
        int[][] edges03 = {{1,0}};
        int[] result03 = {1,1};
        assertArrayEquals(result03, sdt.sumOfDistancesInTree(n03, edges03));
    }
}