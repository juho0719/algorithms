package com.juho.leetCode.challenge.y2021.month12.day31;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class MaximumDifferenceBetweenNodeAndAncestorTest {

    MaximumDifferenceBetweenNodeAndAncestor mdna = new MaximumDifferenceBetweenNodeAndAncestor();

    @Test
    public void maximumDifferenceBetweenNodeAndAncestor01Test() {
        TreeNode root101 = new TreeNode(8);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(10);
        TreeNode root104 = new TreeNode(1);
        TreeNode root105 = new TreeNode(6);
        TreeNode root106 = new TreeNode(14);
        TreeNode root107 = new TreeNode(4);
        TreeNode root108 = new TreeNode(7);
        TreeNode root109 = new TreeNode(13);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        root105.left = root107;
        root105.right = root108;
        root106.left = root109;
        assertEquals(7, mdna.maxAncestorDiff(root101));
    }
}