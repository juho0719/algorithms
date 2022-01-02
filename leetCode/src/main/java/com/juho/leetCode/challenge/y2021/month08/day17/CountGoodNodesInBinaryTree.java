package com.juho.leetCode.challenge.y2021.month08.day17;

import com.juho.leetCode.datastructure.TreeNode;

public class CountGoodNodesInBinaryTree {
    int count = 0;
    public int goodNodes(TreeNode root) {
        preOrder(root, Integer.MIN_VALUE);
        return count;
    }
    void preOrder(TreeNode root , int max) {
        if(root==null)
            return;
        
        if(root.val>=max)
            count++;
        
        preOrder(root.left , Math.max(max , root.val));
        preOrder(root.right , Math.max(max , root.val));
    }
}