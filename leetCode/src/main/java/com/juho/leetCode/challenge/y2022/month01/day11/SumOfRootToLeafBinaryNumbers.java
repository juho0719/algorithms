package com.juho.leetCode.challenge.y2022.month01.day11;

import com.juho.leetCode.datastructure.TreeNode;

/**
 * You are given the root of a binary tree where each node has a value 0 or 1. 
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 * - For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf. 
 * Return the sum of these numbers.
 * The test cases are generated so that the answer fits in a 32-bits integer.
 * 
 * Example 1:
 * Input: root = [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * 
 * Example 2:
 * Input: root = [0]
 * Output: 0
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [1, 1000].
 * Node.val is 0 or 1.

 */
public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        int rootToLeaf = 0, currNumber = 0;
        int steps;
        TreeNode predecessor;

        while (root != null) {
            if (root.left != null) {
                predecessor = root.left;
                steps = 1;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                    ++steps;
                }
                if (predecessor.right == null) {
                    currNumber = (currNumber << 1) | root.val;
                    predecessor.right = root;
                    root = root.left;
                } else {
                    if (predecessor.left == null) {
                        rootToLeaf += currNumber;
                    }
                    for(int i = 0; i < steps; ++i) {
                        currNumber >>= 1;
                    }
                    predecessor.right = null;
                    root = root.right;
                }
            } else {
                currNumber = (currNumber << 1) | root.val;
                if (root.right == null) {
                    rootToLeaf += currNumber;
                }
                root = root.right;
            }
        }
        return rootToLeaf;
    }
}