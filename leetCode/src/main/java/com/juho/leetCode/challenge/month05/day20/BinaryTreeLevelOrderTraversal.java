package com.juho.leetCode.challenge.month05.day20;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int qlen = queue.size();
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < qlen; i++) {
                TreeNode curr = queue.poll();
                row.add(curr.val);
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
            ans.add(row);
        }
        return ans;
    }
}
