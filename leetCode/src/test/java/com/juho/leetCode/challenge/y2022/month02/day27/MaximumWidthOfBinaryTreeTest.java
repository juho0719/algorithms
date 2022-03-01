package com.juho.leetCode.challenge.y2022.month02.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class MaximumWidthOfBinaryTreeTest {

    MaximumWidthOfBinaryTree mwbt = new MaximumWidthOfBinaryTree();

    @Test
    public void maximumWidthOfBinaryTree01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(2);
        TreeNode root104 = new TreeNode(5);
        TreeNode root105 = new TreeNode(3);
        TreeNode root106 = new TreeNode(9);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        assertEquals(4, mwbt.widthOfBinaryTree(root101));
        
    }
}