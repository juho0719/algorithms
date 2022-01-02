package com.juho.leetCode.challenge.month02.day06;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TreeNode;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        result.add(root.val);

        int depth = 1;
        if(root.right != null) {
            downTree(root.right, result, depth+1);
        }
        if(root.left != null) {
            downTree(root.left, result, depth+1);
        }

        return result;
    }

    private void downTree(TreeNode node, List<Integer> result, int depth) {
        if(result.size() < depth) {
            result.add(node.val);
        } 
        if(node.right != null) {
            downTree(node.right, result, depth+1);
        }
        if(node.left != null) {
            downTree(node.left, result, depth+1);
        }
    }
}
