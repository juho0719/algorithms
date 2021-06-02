package com.juho.leetCode.challenge.month02.day14;

import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {

    public boolean isBipartiteByBFS(int[][] graph) {
        int N = graph.length;
        int[] colors = new int[N]; // 0 not colored, 1 = Red, -1 = Blue
        for(int vertex = 0; vertex < N; vertex++) { // handle forest
            if(colors[vertex] == 0) {
                colors[vertex] = 1;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(vertex);
                
                while(!queue.isEmpty()) {
                    int currVert = queue.poll();
                    for(int adjVert : graph[currVert]) {
                        if(colors[adjVert] == colors[currVert])
                            return false;
                        if(colors[adjVert] == 0) {
                            colors[adjVert] = -colors[currVert];
                            queue.add(adjVert);
                        }
                    }
                }
            }
        }
        
        return true;
    }

    public boolean isBipartiteByDFS(int[][] graph) {
        int N = graph.length;
        int[] colors = new int[N]; // 0 not colored, 1 = Red, -1 = Blue
        for(int vertex = 0; vertex < N; vertex++)
            if(colors[vertex] == 0 && !dfs(graph, vertex, 1, colors))
                return false;
        
        return true;
    }
    
    private boolean dfs(int[][] graph, int vertex, int color, int[] colors) {
        if(colors[vertex] != 0)
            return colors[vertex] == color;
            
        colors[vertex] = color;
        for(int adjVert : graph[vertex])
            if(!dfs(graph, adjVert, -color, colors)) 
                return false;
        
        return true;
    }
}
