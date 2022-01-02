package com.juho.leetCode.challenge.y2021.month10.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class CousinsInBinaryTreeTest {

    CousinsInBinaryTree cbt = new  CousinsInBinaryTree();

    @Test
    public void cousinsInBinaryTree01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(4);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        int x01 = 4;
        int y01 = 3;
        assertEquals(false, cbt.isCousins(root101, x01, y01));

        TreeNode root201 = new TreeNode(1);
        TreeNode root202 = new TreeNode(2);
        TreeNode root203 = new TreeNode(3);
        TreeNode root204 = new TreeNode(4);
        TreeNode root205 = new TreeNode(5);
        root201.left = root202;
        root201.right = root203;
        root202.right = root204;
        root203.right = root205;
        int x02 = 5;
        int y02 = 4;
        assertEquals(true, cbt.isCousins(root201, x02, y02));
        
        TreeNode root301 = new TreeNode(1);
        TreeNode root302 = new TreeNode(2);
        TreeNode root303 = new TreeNode(3);
        TreeNode root304 = new TreeNode(4);
        root301.left = root302;
        root301.right = root303;
        root302.right = root304;
        int x03 = 2;
        int y03 = 3;
        assertEquals(false, cbt.isCousins(root301, x03, y03));
    }
}