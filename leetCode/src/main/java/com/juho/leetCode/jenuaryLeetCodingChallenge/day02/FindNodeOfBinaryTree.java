package com.juho.leetCode.jenuaryLeetCodingChallenge.day02;

import com.juho.leetCode.datastructure.TreeNode;

public class FindNodeOfBinaryTree {

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