package com.juho.leetCode.mayLeetCodingChallenge.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class BinaryTreeCamerasTest {

    BinaryTreeCameras btc = new BinaryTreeCameras();
    
    @Test
    public void binaryTreeCameras01Test() {
        TreeNode root101 = new TreeNode(0);
        TreeNode root102 = new TreeNode(0);
        TreeNode root103 = new TreeNode(0);
        TreeNode root104 = new TreeNode(0);
        root101.left = root102;
        root102.left = root103;
        root102.right = root104;
        assertEquals(1, btc.minCameraCover(root101));
    }
}