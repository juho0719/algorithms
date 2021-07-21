package com.juho.leetCode.challenge.month07.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class LowestCommonAncestorOfaBinarySearchTreeTest {

    LowestCommonAncestorOfaBinarySearchTree lcabst = new LowestCommonAncestorOfaBinarySearchTree();

    @Test
    public void lowestCommonAncestorOfaBinarySearchTree01Test() {
        TreeNode root101 = new TreeNode(6);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(8);
        TreeNode root104 = new TreeNode(0);
        TreeNode root105 = new TreeNode(4);
        TreeNode root106 = new TreeNode(7);
        TreeNode root107 = new TreeNode(9);
        TreeNode root108 = new TreeNode(3);
        TreeNode root109 = new TreeNode(5);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        root103.right = root107;
        root105.left = root108;
        root105.right = root109;
        TreeNode p01 = new TreeNode(2);
        TreeNode q01 = new TreeNode(8);
        assertEquals(root101.toString(), lcabst.lowestCommonAncestor(root101, p01, q01).toString());
    }

}
