package com.juho.leetCode.challenge.y2021.month12.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class BinaryTreeTiltTest {

    BinaryTreeTilt btt = new BinaryTreeTilt();

    @Test
    public void binaryTreeTilt01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        root101.left = root102;
        root101.right = root103;
        assertEquals(1, btt.findTilt(root101));

        TreeNode root201 = new TreeNode(4);
        TreeNode root202 = new TreeNode(2);
        TreeNode root203 = new TreeNode(9);
        TreeNode root204 = new TreeNode(3);
        TreeNode root205 = new TreeNode(5);
        TreeNode root206 = new TreeNode(7);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.right = root206;
        assertEquals(15, btt.findTilt(root201));
    }
}