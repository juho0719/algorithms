package com.juho.leetCode.datastructure;

public class TreeNode2 {
    public int val;
    public TreeNode2 left;
    public TreeNode2 right;
    public TreeNode2() {}
    public TreeNode2(int val) { this.val = val; }
    public TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}