package com.juho.leetCode.marchLeetCodingChallenge.day25;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PacificAtlanticWaterFlowTest {
    
    PacificAtlanticWaterFlow pawf = new PacificAtlanticWaterFlow();

    @Test
    public void pacificAtlanticWaterFlow01Test() {
        int[][] matrix = {{1,2,2,3,5}, {3,2,3,4,4}, {2,4,5,3,1}, {6,7,1,4,5}, {5,1,1,2,4}};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> field01 = new ArrayList<>();
        field01.add(0);
        field01.add(4);
        result.add(field01);

        List<Integer> field02 = new ArrayList<>();
        field02.add(1);
        field02.add(3);
        result.add(field02);

        List<Integer> field03 = new ArrayList<>();
        field03.add(1);
        field03.add(4);
        result.add(field03);

        List<Integer> field04 = new ArrayList<>();
        field04.add(2);
        field04.add(2);
        result.add(field04);

        List<Integer> field05 = new ArrayList<>();
        field05.add(3);
        field05.add(0);
        result.add(field05);

        List<Integer> field06 = new ArrayList<>();
        field06.add(3);
        field06.add(1);
        result.add(field06);

        List<Integer> field07 = new ArrayList<>();
        field07.add(4);
        field07.add(0);
        result.add(field07);
        
        assertArrayEquals(result.toArray(), pawf.pacificAtlantic(matrix).toArray());
    }
}
