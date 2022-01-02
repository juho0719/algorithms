package com.juho.leetCode.challenge.y2021.month10.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class CountCompleteTreeNodesTest {

    CountCompleteTreeNodes cctn = new CountCompleteTreeNodes();

    @Test
    public void countCompleteTreeNodes01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(4);
        TreeNode root105 = new TreeNode(5);
        TreeNode root106 = new TreeNode(6);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        assertEquals(6, cctn.countNodes(root101));
    }
}