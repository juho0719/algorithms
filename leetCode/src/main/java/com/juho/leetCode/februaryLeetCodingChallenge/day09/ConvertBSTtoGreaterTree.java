package com.juho.leetCode.februaryLeetCodingChallenge.day09;

import com.juho.leetCode.datastructure.TreeNode2;

public class ConvertBSTtoGreaterTree {

    int sum = 0;

    public TreeNode2 convertBST(TreeNode2 root) {
        if(root == null) return null;
        if(root.right != null) {
            convertBST(root.right);
        }

        sum += root.val;
        root.val = sum;

        if(root.left != null) {
            convertBST(root.left);
        }

        return root;
    }
}
