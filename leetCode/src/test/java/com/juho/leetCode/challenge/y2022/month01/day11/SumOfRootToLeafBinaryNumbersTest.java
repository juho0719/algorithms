package com.juho.leetCode.challenge.y2022.month01.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class SumOfRootToLeafBinaryNumbersTest {

    SumOfRootToLeafBinaryNumbers srlbn = new SumOfRootToLeafBinaryNumbers();

    @Test
    public void sumOfRootToLeafBinaryNumbers01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(0);
        TreeNode root103 = new TreeNode(1);
        TreeNode root104 = new TreeNode(0);
        TreeNode root105 = new TreeNode(1);
        TreeNode root106 = new TreeNode(0);
        TreeNode root107 = new TreeNode(1);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        root103.right = root107;
        assertEquals(22, srlbn.sumRootToLeaf(root101));
    }
}