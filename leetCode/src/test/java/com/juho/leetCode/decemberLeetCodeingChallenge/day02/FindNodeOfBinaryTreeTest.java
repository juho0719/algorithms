package com.juho.leetCode.decemberLeetCodingChallenge.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FindNodeOfBinaryTreeTest {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }

    @Test
    public void findNodeOfBinaryTree01Test() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode(7);
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);

        TreeNode target = new TreeNode(3);
        target.left = new TreeNode(6);
        target.right = new TreeNode(19);

        TreeNode result = getTargetCopy(original, cloned, target);
        assertEquals(result.val, target.val);        
    }
}