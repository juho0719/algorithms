package com.juho.leetCode.challenge.month08.day06;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> traversal = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            while (size-- > 0) {
                Node node = q.remove();
                level.add(node.val);
                q.addAll(node.children);
            }
            traversal.add(level);
        }
        return traversal;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
