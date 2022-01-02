package com.juho.leetCode.challenge.month09.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TransformToChessboardTest {

    TransformToChessboard tc = new TransformToChessboard();

    @Test
    public void transformToChessboard01Test() {
        int[][] board01 = {{0,1,1,0},{0,1,1,0},{1,0,0,1},{1,0,0,1}};
        assertEquals(2, tc.movesToChessboard(board01));

        int[][] board02 = {{0,1},{1,0}};
        assertEquals(0, tc.movesToChessboard(board02));

        int[][] board03 = {{1,0},{1,0}};
        assertEquals(-1, tc.movesToChessboard(board03));
    }
}