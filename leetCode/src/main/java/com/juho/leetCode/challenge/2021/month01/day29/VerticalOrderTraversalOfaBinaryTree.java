package com.juho.leetCode.challenge.month01.day29;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

import com.juho.leetCode.datastructure.TreeNode;

public class VerticalOrderTraversalOfaBinaryTree {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return null;

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        binaryTree(root, 0, 0, map);
        
        for(Map.Entry<Integer, TreeMap<Integer, PriorityQueue<Integer>>> entry : map.entrySet()) {
            List<Integer> line = new ArrayList<>();
            for (PriorityQueue<Integer> pq : entry.getValue().values()) {
                while(pq.size() > 0) {
                    line.add(pq.poll());
                }
            }
            result.add(line);
        }
        return result;
    }

    private void binaryTree(TreeNode root, int x, int y, TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {
        if(root == null) return;

        TreeMap<Integer, PriorityQueue<Integer>> bMap = new TreeMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if(map.containsKey(x)) {
            bMap = map.get(x);
            if(bMap.containsKey(y)) {
                pq = bMap.get(y);
            }
        }
        pq.add(root.val);
        bMap.put(y, pq);
        map.put(x, bMap);

        binaryTree(root.left, x - 1, y + 1, map);
        binaryTree(root.right, x + 1, y + 1, map);
    }
}
