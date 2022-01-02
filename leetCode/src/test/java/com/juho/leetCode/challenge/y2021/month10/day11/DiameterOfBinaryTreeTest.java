package com.juho.leetCode.challenge.y2021.month10.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {

    DiameterOfBinaryTree dbt = new DiameterOfBinaryTree();

    @Test
    public void diameterOfBinaryTree01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(4);
        TreeNode root105 = new TreeNode(5);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        assertEquals(3, dbt.diameterOfBinaryTree(root101));
    }
}