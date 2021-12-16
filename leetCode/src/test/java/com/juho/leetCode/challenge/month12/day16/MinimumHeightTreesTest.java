package com.juho.leetCode.challenge.month12.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MinimumHeightTreesTest {

    MinimumHeightTrees mht = new MinimumHeightTrees();

    @Test
    public void minimumHeightTrees01Test() {
        int n01 = 4;
        int[][] edges01 = {{1,0},{1,2},{1,3}};
        List<Integer> result01 = new ArrayList<>();
        result01.add(1);
        assertEquals(result01, mht.findMinHeightTrees(n01, edges01));

        int n02 = 6;
        int[][] edges02 = {{3,0},{3,1},{3,2},{3,4},{5,4}};
        List<Integer> result02 = new ArrayList<>();
        result02.add(3);
        result02.add(4);
        assertEquals(result02, mht.findMinHeightTrees(n02, edges02));

        int n03 = 1;
        int[][] edges03 = {};
        List<Integer> result03 = new ArrayList<>();
        result03.add(0);
        assertEquals(result03, mht.findMinHeightTrees(n03, edges03));

        int n04 = 2;
        int[][] edges04 = {{0,1}};
        List<Integer> result04 = new ArrayList<>();
        result04.add(0);
        result04.add(1);
        assertEquals(result04, mht.findMinHeightTrees(n04, edges04));
    }
}