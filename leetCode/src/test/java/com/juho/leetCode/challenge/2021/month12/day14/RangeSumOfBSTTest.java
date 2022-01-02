package com.juho.leetCode.challenge.month12.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class RangeSumOfBSTTest {

    RangeSumOfBST rs = new RangeSumOfBST();

    @Test
    public void rangeSumOfBST01Test() {
        TreeNode root101 = new TreeNode(10);
        TreeNode root102 = new TreeNode(5);
        TreeNode root103 = new TreeNode(15);
        TreeNode root104 = new TreeNode(3);
        TreeNode root105 = new TreeNode(7);
        TreeNode root106 = new TreeNode(18);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        int low01 = 7;
        int high01 = 15;
        assertEquals(32, rs.rangeSumBST(root101, low01, high01));

        TreeNode root201 = new TreeNode(10);
        TreeNode root202 = new TreeNode(5);
        TreeNode root203 = new TreeNode(15);
        TreeNode root204 = new TreeNode(3);
        TreeNode root205 = new TreeNode(7);
        TreeNode root206 = new TreeNode(13);
        TreeNode root207 = new TreeNode(18);
        TreeNode root208 = new TreeNode(1);
        TreeNode root209 = new TreeNode(6);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.left = root206;
        root203.right = root207;
        root204.left = root208;
        root205.left = root209;
        int low02 = 6;
        int high02 = 10;
        assertEquals(23, rs.rangeSumBST(root201, low02, high02));
    }
}