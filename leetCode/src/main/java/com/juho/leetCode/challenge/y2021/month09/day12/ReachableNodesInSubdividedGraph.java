package com.juho.leetCode.challenge.y2021.month09.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReachableNodesInSubdividedGraph {
    
    public int reachableNodes(int[][] edges, int maxMoves, int n) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] edge: edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            graph.computeIfAbsent(u, x->new HashMap<>()).put(v, w);
            graph.computeIfAbsent(v, x->new HashMap<>()).put(u, w);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.dist, b.dist));
        pq.offer(new Node(0, 0));

        Map<Integer, Integer> dist = new HashMap<>();
        dist.put(0, 0);
        Map<Integer, Integer> used = new HashMap<>();
        int ans = 0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int intNode = node.node;
            int d = node.dist;
            if (d > dist.getOrDefault(intNode, 0)) continue;
            ans++;

            if (!graph.containsKey(intNode)) continue;
            for (int nei: graph.get(intNode).keySet()) {
                int weight = graph.get(intNode).get(nei);
                int v = Math.min(weight, maxMoves - d);
                used.put(n * intNode + nei, v);

                int d2 = d + weight + 1;
                if (d2 < dist.getOrDefault(nei, maxMoves+1)) {
                    pq.offer(new Node(nei, d2));
                    dist.put(nei, d2);
                }
            }
        }
        for (int[] edge: edges) {
            ans += Math.min(edge[2], used.getOrDefault(edge[0] * n + edge[1], 0) +
                                     used.getOrDefault(edge[1] * n + edge[0], 0) );
        }

        return ans;
    }
}

class Node {
    int node, dist;
    Node(int n, int d) {
        node = n;
        dist = d;
    }
}