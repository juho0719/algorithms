package com.juho.leetCode.decemberLeetCodingChallenge.day02;

public class FindNodeOfBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }

    public TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original.val == target.val) return cloned;

        TreeNode result;
        if(original.left != null) {
            result = getTargetCopy(original.left, cloned.left, target);
            if(result != null) return result;
        }
        if(original.right != null) {
            result = getTargetCopy(original.right, cloned.right, target);
            if(result != null) return result;
        }
        return null;
    }
}