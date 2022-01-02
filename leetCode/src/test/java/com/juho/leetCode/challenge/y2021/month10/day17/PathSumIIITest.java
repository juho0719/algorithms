package com.juho.leetCode.challenge.y2021.month10.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class PathSumIIITest {

    PathSumIII ps3 = new  PathSumIII();

    @Test
    public void pathSumIII01Test() {
        TreeNode root101 = new TreeNode(10);
        TreeNode root102 = new TreeNode(5);
        TreeNode root103 = new TreeNode(-3);
        TreeNode root104 = new TreeNode(3);
        TreeNode root105 = new TreeNode(2);
        TreeNode root106 = new TreeNode(11);
        TreeNode root107 = new TreeNode(3);
        TreeNode root108 = new TreeNode(-2);
        TreeNode root109 = new TreeNode(1);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        root104.left = root107;
        root104.right = root108;
        root105.right = root109;
        int targetSum01 = 8;
        assertEquals(3, ps3.pathSum(root101, targetSum01));
    }
}