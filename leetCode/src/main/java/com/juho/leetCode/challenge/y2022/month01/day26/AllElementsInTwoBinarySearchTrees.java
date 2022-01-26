package com.juho.leetCode.challenge.y2022.month01.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import com.juho.leetCode.datastructure.TreeNode;

/**
 * Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
 * 
 * Example 1:
 * Input: root1 = [2,1,4], root2 = [1,0,3]
 * Output: [0,1,1,2,3,4]
 * 
 * Example 2:
 * Input: root1 = [1,null,8], root2 = [8,1]
 * Output: [1,1,8,8]
 * 
 * Constraints:
 * The number of nodes in each tree is in the range [0, 5000].
 * -10^5 <= Node.val <= 10^5
 */

public class AllElementsInTwoBinarySearchTrees {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        populate(root1, s1);
        populate(root2, s2);
        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode r1 = s1.peek();
            TreeNode r2 = s2.peek();
            if (r1.val > r2.val) {
                result.add(r2.val);
                s2.pop();
                populate(r2.right, s2);
            } else {
                result.add(r1.val);
                s1.pop();
                populate(r1.right, s1);
            }

        }
        Stack<TreeNode> s = s1.isEmpty() ? s2 : s1;
        while (!s.isEmpty()) {
            TreeNode r = s.pop();
            result.add(r.val);
            populate(r.right, s);
        }
        return result;
    }

    public void populate(TreeNode root, Stack<TreeNode> s) {
        if (root == null) {
            return;
        }
        s.add(root);
        populate(root.left, s);
    }
}