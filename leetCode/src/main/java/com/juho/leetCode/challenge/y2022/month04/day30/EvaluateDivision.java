package com.juho.leetCode.challenge.y2022.month04.day30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

public class EvaluateDivision {
    
    private  Map<String, Map<String, Double>> makeGraph(List<List<String>> e, double[] values){
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String u, v;
        
        for(int i = 0; i < e.size(); i++){
            u = e.get(i).get(0);
            v = e.get(i).get(1);
            
            graph.putIfAbsent(u, new HashMap<>());
            graph.get(u).put(v, values[i]);
            
            graph.putIfAbsent(v, new HashMap<>());
            graph.get(v).put(u, 1/values[i]);
            
        }
        return graph;
    }
    
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = makeGraph(equations, values);
        double []ans = new double[queries.size()];
        for(int i = 0; i < queries.size(); i++){
            ans[i] = dfs(queries.get(i).get(0) , queries.get(i).get(1) , new HashSet<>(), graph);
        }
        return ans;
    }
    
    public double dfs(String src, String dest, Set<String> visited, Map<String, Map<String, Double>> graph){
        
        if(graph.containsKey(src ) == false)
            return -1.0;
        if(graph.get(src).containsKey(dest)){
            return graph.get(src).get(dest);
        }
        
        visited.add(src);
        
        for(Map.Entry<String, Double> nbr : graph.get(src).entrySet()){
            if(visited.contains(nbr.getKey()) == false){
                double weight = dfs(nbr.getKey(), dest, visited, graph);
                if(weight != -1.0){
                    return nbr.getValue() * weight;
                }
            }
        }
        return -1.0;
    }
}