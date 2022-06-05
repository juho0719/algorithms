package com.juho.leetCode.challenge.y2022.month06.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NQueensIITest {

    NQueensII nq2 = new NQueensII();

    @Test
    public void nQueensII01Test() {
        int n01 = 4;
        assertEquals(2, nq2.totalNQueens(n01));
    }
}