package com.juho.leetCode.challenge.y2022.month04.day12;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class GameOfLifeTest {

    GameOfLife gl = new GameOfLife();

    @Test
    public void gameOfLife01Test() {
        int[][] board01 = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        int[][] result01 = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        gl.gameOfLife(board01);
        assertArrayEquals(result01, board01);
    }
}