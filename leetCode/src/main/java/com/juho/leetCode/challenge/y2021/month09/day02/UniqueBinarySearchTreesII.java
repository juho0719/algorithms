package com.juho.leetCode.challenge.y2021.month09.day02;

import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;

public class UniqueBinarySearchTreesII {
    
    public List<TreeNode> generateTrees(int n) {
        return generateBSTs(1, n);
    }
    List<TreeNode> generateBSTs(int start, int end) {
        List<TreeNode> currentBSTs = new ArrayList<>();
        if(start > end) {
            currentBSTs.add(null);
        }
        else {
            for(int rootVal = start; rootVal <= end; rootVal ++) {                
                List<TreeNode> leftSubtreeRoots = generateBSTs(start, rootVal - 1);
                List<TreeNode> rightSubtreeRoots = generateBSTs(rootVal + 1, end);
                for(TreeNode leftChild : leftSubtreeRoots) {                    
                    for(TreeNode rightChild : rightSubtreeRoots) {
                        TreeNode root = new TreeNode(rootVal);
                        root.left = leftChild;
                        root.right = rightChild;
                        currentBSTs.add(root);
                    }
                }
            }
        }
        return currentBSTs;
    }
}