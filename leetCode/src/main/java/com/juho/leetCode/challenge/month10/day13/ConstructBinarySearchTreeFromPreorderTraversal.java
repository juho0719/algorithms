package com.juho.leetCode.challenge.month10.day13;

import com.juho.leetCode.datastructure.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        return buildBST(preorder, 0, n-1);
    }
    
    private TreeNode buildBST(int pre[], int start, int end){
        if(start > end) return null;
        if(start == end){
            return new TreeNode(pre[start], null, null);
        }
        int mid  = start;
        int currVal = pre[start];
        while(mid < pre.length && pre[mid] <= currVal){
            mid++;
        }
        TreeNode root = new TreeNode(currVal);
        root.left = buildBST(pre, start+1, mid-1);
        root.right = buildBST(pre, mid, end);
        return root;
    }
}