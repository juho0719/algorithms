package com.juho.leetCode.challenge.month11.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    ConstructBinaryTreeFromInorderAndPostorderTraversal cbtip = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    public void constructBinaryTreeFromInorderAndPostorderTraversal01Test() {
        int[] inorder01 = {9,3,15,20,7};
        int[] postorder01 = {9,15,7,20,3};
        TreeNode result101 = new TreeNode(3);
        TreeNode result102 = new TreeNode(9);
        TreeNode result103 = new TreeNode(20);
        TreeNode result104 = new TreeNode(15);
        TreeNode result105 = new TreeNode(7);
        result101.left = result102;
        result101.right = result103;
        result103.left = result104;
        result103.right = result105;
        assertEquals(result101.toString(), cbtip.buildTree(inorder01, postorder01).toString());

        int[] inorder02 = {-1};
        int[] postorder02 = {-1};
        TreeNode result201 = new TreeNode(-1);
        assertEquals(result201.toString(), cbtip.buildTree(inorder02, postorder02).toString());
    }
}