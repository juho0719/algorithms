package com.juho.leetCode.challenge.month08.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class TwoSumIV_InputisaBSTTest {

    TwoSumIV_InputisaBST tibst = new TwoSumIV_InputisaBST();

    @Test
    public void twoSumIV_InputisaBST01Test() {
        TreeNode root101 = new TreeNode(5);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(6);
        TreeNode root104 = new TreeNode(2);
        TreeNode root105 = new TreeNode(4);
        TreeNode root106 = new TreeNode(7);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        assertEquals(true, tibst.findTarget(root101, 9));

        TreeNode root201 = new TreeNode(5);
        TreeNode root202 = new TreeNode(3);
        TreeNode root203 = new TreeNode(6);
        TreeNode root204 = new TreeNode(2);
        TreeNode root205 = new TreeNode(4);
        TreeNode root206 = new TreeNode(7);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.right = root206;
        assertEquals(false, tibst.findTarget(root201, 28));

        TreeNode root301 = new TreeNode(2);
        TreeNode root302 = new TreeNode(1);
        TreeNode root303 = new TreeNode(3);
        root301.left = root302;
        root301.right = root303;
        assertEquals(true, tibst.findTarget(root301, 4));
    }
}