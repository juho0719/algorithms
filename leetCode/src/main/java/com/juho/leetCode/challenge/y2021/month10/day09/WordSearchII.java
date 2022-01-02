package com.juho.leetCode.challenge.y2021.month10.day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordSearchII {
    private int[][] DIRECTIONS = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
    private TrieNode root;
    
    public List<String> findWords(char[][] board, String[] words) {
        this.root = new TrieNode();
        for (String w : words) 
            insert(w);
        boolean[][] visited = new boolean[board.length][board[0].length];
        Set<String> res = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                Character c = board[i][j];
                dfs(i, j, res, visited, board, root);
            }
        }
        
        return new ArrayList<>(res);
    }
    
    private void dfs(int x, int y, Set<String> res,
                     boolean[][] visited, char[][] board, TrieNode curr) {
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) return;
        if (visited[x][y]) return;
        if (!curr.children.containsKey(board[x][y])) return;
        visited[x][y] = true;
        TrieNode next = curr.children.get(board[x][y]);
        if (next.word != null) res.add(next.word);
        for (int[] d : DIRECTIONS) {
            int newX = x + d[0], newY = y + d[1];
            dfs(newX, newY, res, visited, board, next);
        }
        visited[x][y] = false;
    }
    
    private void insert(String w) {
        TrieNode curr = root;
        for (int i = 0; i < w.length(); i++) {
            Character c = w.charAt(i);
            if (!curr.children.containsKey(c)) curr.children.put(c, new TrieNode());
            curr = curr.children.get(c);
            if (i == w.length() - 1) curr.word = w;
        }
    }
    
    public static class TrieNode {
        private Map<Character, TrieNode> children;
        private String word;
        public TrieNode() {
            this.children = new HashMap<>();
        }
    }
}