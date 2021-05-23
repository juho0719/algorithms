package com.juho.leetCode.mayLeetCodingChallenge.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NQueensTest {
    
    @Test
    public void nQueens01Test() {
        NQueens nq01 = new NQueens();
        int n01 = 4;
        List<List<String>> result01 = new ArrayList<>();
        List<String> result01Children01 = new ArrayList<>();
        result01Children01.add(".Q..");
        result01Children01.add("...Q");
        result01Children01.add("Q...");
        result01Children01.add("..Q.");
        result01.add(result01Children01);
        List<String> result01Children02 = new ArrayList<>();
        result01Children02.add("..Q.");
        result01Children02.add("Q...");
        result01Children02.add("...Q");
        result01Children02.add(".Q..");
        result01.add(result01Children02);
        assertEquals(result01, nq01.solveNQueens(n01));

        NQueens nq02 = new NQueens();
        int n02 = 1;
        List<List<String>> result02 = new ArrayList<>();
        List<String> result02Children01 = new ArrayList<>();
        result02Children01.add("Q");
        result02.add(result02Children01);
        assertEquals(result02, nq02.solveNQueens(n02));
    }
}