package com.juho.leetCode.challenge.y2022.month06.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NQueensTest {

    NQueens nq = new NQueens();

    @Test
    public void nQueens01Test() {
        int n01 = 4;
        List<List<String>> result100 = new ArrayList<>();
        List<String> result101 = new ArrayList<>();
        result101.add(".Q..");
        result101.add("...Q");
        result101.add("Q...");
        result101.add("..Q.");
        result100.add(result101);
        List<String> result102 = new ArrayList<>();
        result102.add("..Q.");
        result102.add("Q...");
        result102.add("...Q");
        result102.add(".Q..");
        result100.add(result102);
        assertEquals(result100, nq.solveNQueens(n01));
    }
}