package com.juho.leetCode.challenge.y2021.month08.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class MaximumProductOfSplittedBinaryTreeTest {

    @Test
    public void maximumProductOfSplittedBinaryTree01Test() {
        MaximumProductOfSplittedBinaryTree mpsbt01 = new MaximumProductOfSplittedBinaryTree();
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(4);
        TreeNode root105 = new TreeNode(5);
        TreeNode root106 = new TreeNode(6);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        assertEquals(110, mpsbt01.maxProduct(root101));

        MaximumProductOfSplittedBinaryTree mpsbt02 = new MaximumProductOfSplittedBinaryTree();
        TreeNode root201 = new TreeNode(1);
        TreeNode root202 = new TreeNode(2);
        TreeNode root203 = new TreeNode(3);
        TreeNode root204 = new TreeNode(4);
        TreeNode root205 = new TreeNode(5);
        TreeNode root206 = new TreeNode(6);
        root201.right = root202;
        root202.left = root203;
        root202.right = root204;
        root204.left = root205;
        root204.right = root206;
        assertEquals(90, mpsbt02.maxProduct(root201));
    }
}
