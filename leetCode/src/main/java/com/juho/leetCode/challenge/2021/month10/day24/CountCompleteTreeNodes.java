package com.juho.leetCode.challenge.month10.day24;

import com.juho.leetCode.datastructure.TreeNode;

/**
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, 
 * and all nodes in the last level are as far left as possible. 
 * It can have between 1 and 2h nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.
 * 
 * Example 1: 
 * Input: root = [1,2,3,4,5,6]
 * Output: 6
 * 
 * Example 2: 
 * Input: root = []
 * Output: 0
 * 
 * Example 3: 
 * Input: root = [1]
 * Output: 1
 * 
 * Constraints: 
 * The number of nodes in the tree is in the range [0, 5 * 10^4].
 * 0 <= Node.val <= 5 * 10^4
 * The tree is guaranteed to be complete.
 */
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        int lh = leftHeight(root);
        int rh = rightHeight(root);
        return lh == rh ?  (1 << lh) -1 : 1 + countNodes(root.left) + countNodes(root.right);
    }
    private int leftHeight(TreeNode root){
        if(root == null) return 0;
        return 1 + leftHeight(root.left);
    }
    private int rightHeight(TreeNode root){
        if(root == null) return 0;
        return 1 + rightHeight(root.right);
    }
}