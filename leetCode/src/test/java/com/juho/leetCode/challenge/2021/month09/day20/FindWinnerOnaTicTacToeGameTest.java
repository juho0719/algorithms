package com.juho.leetCode.challenge.month09.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindWinnerOnaTicTacToeGameTest {

    FindWinnerOnaTicTacToeGame fwttt = new FindWinnerOnaTicTacToeGame();

    @Test
    public void findWinnerOnaTicTacToeGame01Test() {
        int[][] moves01 = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        assertEquals("A", fwttt.tictactoe(moves01));

        int[][] moves02 = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        assertEquals("B", fwttt.tictactoe(moves02));

        int[][] moves03 = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        assertEquals("Draw", fwttt.tictactoe(moves03));

        int[][] moves04 = {{0,0},{1,1}};
        assertEquals("Pending", fwttt.tictactoe(moves04));
    }
}