package com.juho.leetCode.challenge.month07.day26;

import com.juho.leetCode.datastructure.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode getBst(int[] nums,int low,int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getBst(nums,low,mid-1);
        root.right = getBst(nums,mid+1,high);
        return root;
    } 
    
    public TreeNode sortedArrayToBST(int[] nums) {
        return getBst(nums,0,nums.length-1);
    }     
}