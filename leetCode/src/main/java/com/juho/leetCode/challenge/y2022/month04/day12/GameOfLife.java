package com.juho.leetCode.challenge.y2022.month04.day12;

/**
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, 
 * is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * The board is made up of an m x n grid of cells, where each cell has an initial state: 
 * live (represented by a 1) or dead (represented by a 0). 
 * Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) 
 * using the following four rules (taken from the above Wikipedia article):
 * 1. Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * 2. Any live cell with two or three live neighbors lives on to the next generation.
 * 3. Any live cell with more than three live neighbors dies, as if by over-population.
 * 4. Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * The next state is created by applying the above rules simultaneously to every cell in the current state, 
 * where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 * 
 * Example 1:
 * Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
 * Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
 * 
 * Example 2:
 * Input: board = [[1,1],[1,0]]
 * Output: [[1,1],[1,1]]
 * 
 * Constraints:
 * m == board.length
 * n == board[i].length
 * 1 <= m, n <= 25
 * board[i][j] is 0 or 1.
 */

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int rows = board.length, cols = board[0].length;
        int[][] tempBoard = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                int liveNeighbors = neighbor(board, r-1, c-1) + neighbor(board, r-1, c) + neighbor(board, r-1, c+1) + neighbor(board, r, c+1) + 
                                    neighbor(board, r+1, c+1) + neighbor(board, r+1, c) + neighbor(board, r+1, c-1) + neighbor(board, r, c-1);
                if(board[r][c] == 1){ 
                    tempBoard[r][c] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1;
                }else{ 
                    tempBoard[r][c] = (liveNeighbors == 3) ? 1 : 0;
                }
            }
        }

        for(int r = 0; r < rows; r++){
            board[r] = tempBoard[r].clone();
        }
    }

    private int neighbor(int[][] board, int r, int c){
        if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0 ){ return 0; }
        return 1;
    }
}