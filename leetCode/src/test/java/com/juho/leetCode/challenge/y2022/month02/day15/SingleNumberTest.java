package com.juho.leetCode.challenge.y2022.month02.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    SingleNumber mdbt = new SingleNumber();

    @Test
    public void maximumDepthOfBinaryTree01Test() {
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(9);
        TreeNode root103 = new TreeNode(20);
        TreeNode root104 = new TreeNode(15);
        TreeNode root105 = new TreeNode(7);
        root101.left = root102;
        root101.right = root103;
        root103.left = root104;
        root103.right = root105;
        assertEquals(3, mdbt.maxDepth(root101));
    }
}