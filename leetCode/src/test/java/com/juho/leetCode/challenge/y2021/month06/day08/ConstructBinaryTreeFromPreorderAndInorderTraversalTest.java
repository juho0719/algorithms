package com.juho.leetCode.challenge.y2021.month06.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    ConstructBinaryTreeFromPreorderAndInorderTraversal cbtpit = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    public void constructBinaryTreeFromPreorderAndInorderTraversal01Test() {
        int[] preorder01 = {3,9,20,15,7};
        int[] inorder01 = {9,3,15,20,7};
        TreeNode result101 = new TreeNode(3);
        TreeNode result102 = new TreeNode(9);
        TreeNode result103 = new TreeNode(20);
        TreeNode result104 = new TreeNode(15);
        TreeNode result105 = new TreeNode(7);
        result101.left = result102;
        result101.right = result103;
        result103.left = result104;
        result103.right = result105;
        assertEquals(result101.toString(), cbtpit.buildTree(preorder01, inorder01).toString());
    }

}
