package com.juho.leetCode.challenge.month03.day09;

import com.juho.leetCode.datastructure.TreeNode;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {

        int curDepth = 0;
        if(d == 1) {
            TreeNode newNodeRoot = new TreeNode(v);
            newNodeRoot.left = root;
            return newNodeRoot;
        }
        curDepth++;
        addRow(root, v, d, curDepth);
        return root;
    }

    private void addRow(TreeNode node, int v, int depth, int curDepth) {
        if(node == null) return;
        if(curDepth == depth-1) {
            TreeNode newNodeLeft = new TreeNode(v);
            newNodeLeft.left = node.left;
            node.left = newNodeLeft;
        
            TreeNode newNodeRight = new TreeNode(v);
            newNodeRight.right = node.right;
            node.right = newNodeRight;
        } else {
            curDepth++;
            addRow(node.left, v, depth, curDepth);
            addRow(node.right, v, depth, curDepth);
        }
    }
}