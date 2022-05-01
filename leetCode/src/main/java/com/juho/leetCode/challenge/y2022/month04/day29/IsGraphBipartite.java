package com.juho.leetCode.challenge.y2022.month04.day29;

import java.util.LinkedList;
import java.util.Queue;

/**
 * There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. 
 * You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. 
 * More formally, for each v in graph[u], there is an undirected edge between node u and node v. 
 * The graph has the following properties:
 * There are no self-edges (graph[u] does not contain u).
 * There are no parallel edges (graph[u] does not contain duplicate values).
 * If v is in graph[u], then u is in graph[v] (the graph is undirected).
 * The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
 * A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that 
 * every edge in the graph connects a node in set A and a node in set B.
 * Return true if and only if it is bipartite.
 * 
 * Example 1:
 * Input: heights = [[1,2,2],[3,8,2],[5,3,5]]
 * Output: 2
 * Explanation: The route of [1,3,5,3,5] has a maximum absolute difference of 2 in consecutive cells.
 * This is better than the route of [1,2,2,2,5], where the maximum absolute difference is 3.
 * 
 * Example 2:
 * Input: heights = [[1,2,3],[3,8,4],[5,3,5]]
 * Output: 1
 * Explanation: The route of [1,2,3,4,5] has a maximum absolute difference of 1 in consecutive cells, 
 * which is better than route [1,3,5,3,5].
 * 
 * Example 3:
 * Input: heights = [[1,2,1,1,1],[1,2,1,2,1],[1,2,1,2,1],[1,2,1,2,1],[1,1,1,2,1]]
 * Output: 0
 * Explanation: This route does not require any effort.
 * 
 * Constraints:
 * rows == heights.length
 * columns == heights[i].length
 * 1 <= rows, columns <= 100
 * 1 <= heights[i][j] <= 10^6
 */

public class IsGraphBipartite {
    
    public boolean isBipartite(int[][] graph) {
        int N = graph.length;
        int[] colors = new int[N]; // 0 not colored, 1 = Red, -1 = Blue
        for(int vertex = 0; vertex < N; vertex++) {
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
}