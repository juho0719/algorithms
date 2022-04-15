package com.juho.leetCode.challenge.y2022.month04.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Shift2DGridTest {

    Shift2DGrid s2g = new Shift2DGrid();

    @Test
    public void shift2DGrid01Test() {
        int[][] grid01 = {{1,2,3},{4,5,6},{7,8,9}};
        int k01 = 1;
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(9);
        result101.add(1);
        result101.add(2);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(3);
        result102.add(4);
        result102.add(5);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(6);
        result103.add(7);
        result103.add(8);
        result100.add(result103);
        assertEquals(result100, s2g.shiftGrid(grid01, k01));
    }
}