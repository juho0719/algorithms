package com.juho.leetCode.challenge.y2021.month06.day30;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.juho.leetCode.datastructure.TreeNode;

public class LowestCommonAncestorOfaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Deque<TreeNode> stack = new ArrayDeque<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();

        parent.put(root, null);
        stack.push(root);

        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }
        }

        Set<TreeNode> ancestors = new HashSet<>();

        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }

        while (!ancestors.contains(q))
            q = parent.get(q);
        return q;
    }
}