package com.juho.leetCode.challenge.y2021.month10.day11;

import com.juho.leetCode.datastructure.TreeNode;

public class DiameterOfBinaryTree {
    private int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return longestPath;
    }
    private int diameter(TreeNode root){
        if (root == null)   return 0;
        int left_height = diameter(root.left);
        int right_height = diameter(root.right);
        longestPath = Math.max(longestPath , left_height+right_height);
        return Math.max(left_height , right_height) + 1;
    }
}