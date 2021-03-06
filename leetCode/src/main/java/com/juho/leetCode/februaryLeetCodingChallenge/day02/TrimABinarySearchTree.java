package com.juho.leetCode.februaryLeetCodingChallenge.day02;

import com.juho.leetCode.datastructure.TreeNode;

public class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) {
            return null;
        } else {
            if(root.val>=low && root.val <=high){
                root.left = trimBST(root.left, low, high);
                root.right = trimBST(root.right, low, high);
            } else if(root.val<low){
                return trimBST(root.right, low, high);
            } else if(root.val>high){
                return trimBST(root.left, low, high);
            }
            return root;
        }     
    }

}
