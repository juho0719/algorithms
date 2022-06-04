package com.juho.leetCode.challenge.y2022.month06.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 * Each solution contains a distinct board configuration of the n-queens' placement, 
 * where 'Q' and '.' both indicate a queen and an empty space, respectively.
 * 
 * Example 1:
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 * 
 * Example 2:
 * Input: n = 1
 * Output: [["Q"]]
 * 
 * Constraints:
 * 1 <= n <= 9
 */

public class NQueens {
    
    private void add(char[][] board,List<List<String>> ans){
        List<String> rowlist = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = "";
            for(int j=0;j<board[0].length;j++){
                row = row+ board[i][j];
            }
            rowlist.add(row);
            
        }
        ans.add(rowlist);
    }
    private void solve(int row,int n,char[][] board,boolean[] cols,boolean[] nDiagnol,boolean[] rDiagnol,List<List<String>> ans){
       if(row==board.length){
            add(board,ans);
            return;
        }
        for(int col=0;col<n;col++){
            if(!cols[col] && !nDiagnol[row+col] && !rDiagnol[row-col+n-1]){
                cols[col]=true;
                nDiagnol[row+col]=true;
                rDiagnol[row-col+n-1]=true;
                board[row][col]='Q';
                solve(row+1,n,board,cols,nDiagnol,rDiagnol,ans);
                board[row][col]='.';
                cols[col]=false;
                nDiagnol[row+col]=false;
                rDiagnol[row-col+n-1]=false;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2*n-1];
        boolean[] rdiag = new boolean[2*n-1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0,n,board,cols,ndiag,rdiag,ans);
        return ans;
    }
}