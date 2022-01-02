package com.juho.leetCode.challenge.month04.day11;

import java.util.LinkedList;
import java.util.Queue;

import com.juho.leetCode.datastructure.TreeNode;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ans = 0, qlen = 0;
        while (q.size() > 0) {
            qlen = q.size();
            ans = 0;
            for (int i = 0; i < qlen; i++) {
                TreeNode curr = q.poll();
                ans += curr.val;
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return ans;
    }
}