package com.juho.leetCode.challenge.y2022.month04.day18;

import java.util.LinkedList;
import com.juho.leetCode.datastructure.TreeNode;

/**
 * Given the root of a binary search tree, and an integer k, 
 * return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 * 
 * Example 1:
 * Input: root = [3,1,4,null,2], k = 1
 * Output: 1
 * 
 * Example 2:
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 * Output: 3
 * 
 * Constraints:
 * The number of nodes in the tree is n.
 * 1 <= k <= n <= 10^4
 * 0 <= Node.val <= 10^4
 */

public class KthSmallestElementInaBST {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();

        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }
}