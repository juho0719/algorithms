package com.juho.leetCode.challenge.y2021.month05.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NQueenIITest {
    
    NQueenII nq2 = new NQueenII();

    @Test
    public void nQueenII01Test() {
        int n01 = 4;
        assertEquals(2, nq2.totalNQueens(n01));

        int n02 = 1;
        assertEquals(1, nq2.totalNQueens(n02));
    }
}