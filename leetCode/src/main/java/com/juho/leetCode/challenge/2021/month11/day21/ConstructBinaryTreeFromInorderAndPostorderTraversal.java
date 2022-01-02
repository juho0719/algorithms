package com.juho.leetCode.challenge.month11.day21;

import com.juho.leetCode.datastructure.TreeNode;

/**
 * Given two integer arrays inorder and postorder 
 * where inorder is the inorder traversal of a binary tree 
 * and postorder is the postorder traversal of the same tree, 
 * construct and return the binary tree.
 *
 * Example 1:
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * 
 * Example 2:
 * Input: inorder = [-1], postorder = [-1]
 * Output: [-1]
 * 
 * Constraints:
 * 1 <= inorder.length <= 3000
 * postorder.length == inorder.length
 * -3000 <= inorder[i], postorder[i] <= 3000
 * inorder and postorder consist of unique values.
 * Each value of postorder also appears in inorder.
 * inorder is guaranteed to be the inorder traversal of the tree.
 * postorder is guaranteed to be the postorder traversal of the tree.
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    
    public TreeNode build(int[] inorder, int inS, int inE, int[] postorder, int posS, int posE){
        if(inS>inE || posS>posE) return  null;
        
        TreeNode root = new TreeNode(postorder[posE]);
        
        int rootI=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root.val){
                rootI = i;
                break;
            }
        }
        
        root.left = build(inorder,inS,rootI-1,postorder,posS,posS+rootI-inS-1);
        root.right = build(inorder,rootI+1,inE,postorder,posS+rootI-inS,posE-1);
        
        return root;
    }
}