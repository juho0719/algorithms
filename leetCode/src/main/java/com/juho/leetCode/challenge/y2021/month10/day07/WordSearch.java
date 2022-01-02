package com.juho.leetCode.challenge.y2021.month10.day07;

public class WordSearch {
    public boolean helper(int i ,int j,char board[][],String word) {
        if(word.length() == 0)return true;
        if(i<0 || j<0 || i>=board.length || j>= board[i].length || board[i][j]!=word.charAt(0))
            return false;
        
        board[i][j] = ' ';
        boolean top = helper(i-1,j,board,word.substring(1));
        boolean bottom = helper(i+1,j,board,word.substring(1));
        boolean left = helper(i,j-1,board,word.substring(1));
        boolean right = helper(i,j+1,board,word.substring(1));
        
        board[i][j] = word.charAt(0);
        return top || bottom || left || right;

    }
    public boolean exist(char[][] board, String word) {
        for(int i =0;i<board.length;i++) {
            for(int j =0;j<board[i].length;j++)
            {
                if(board[i][j] == word.charAt(0) && helper(i,j,board,word)) return true;
            }
        }
        return false;
    }
}