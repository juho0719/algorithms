package com.juho.leetCode.challenge.y2021.month10.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    InvertBinaryTree ibt = new InvertBinaryTree();

    @Test
    public void invertBinaryTree01Test() {
        TreeNode root101 = new TreeNode(4);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(7);
        TreeNode root104 = new TreeNode(1);
        TreeNode root105 = new TreeNode(3);
        TreeNode root106 = new TreeNode(6);
        TreeNode root107 = new TreeNode(9);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        root103.right = root107;
        
        TreeNode result101 = new TreeNode(4);
        TreeNode result102 = new TreeNode(7);
        TreeNode result103 = new TreeNode(2);
        TreeNode result104 = new TreeNode(9);
        TreeNode result105 = new TreeNode(6);
        TreeNode result106 = new TreeNode(3);
        TreeNode result107 = new TreeNode(1);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result102.right = result105;
        result103.left = result106;
        result103.right = result107;
        assertEquals(result101.toString(), ibt.invertTree(root101).toString());
    }
}