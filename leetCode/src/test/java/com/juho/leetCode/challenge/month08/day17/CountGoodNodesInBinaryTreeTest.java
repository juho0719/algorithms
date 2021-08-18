package com.juho.leetCode.challenge.month08.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class CountGoodNodesInBinaryTreeTest {

    @Test
    public void rangeSumQueryImmutable01Test() {
        CountGoodNodesInBinaryTree cgnbt01 = new CountGoodNodesInBinaryTree();
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(1);
        TreeNode root103 = new TreeNode(4);
        TreeNode root104 = new TreeNode(3);
        TreeNode root105 = new TreeNode(1);
        TreeNode root106 = new TreeNode(5);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root103.left = root105;
        root103.right = root106;
        assertEquals(4, cgnbt01.goodNodes(root101));

        CountGoodNodesInBinaryTree cgnbt02 = new CountGoodNodesInBinaryTree();
        TreeNode root201 = new TreeNode(3);
        TreeNode root202 = new TreeNode(3);
        TreeNode root203 = new TreeNode(4);
        TreeNode root204 = new TreeNode(2);
        root201.left = root202;
        root202.left = root203;
        root202.right = root204;
        assertEquals(3, cgnbt02.goodNodes(root201));
    }
}
