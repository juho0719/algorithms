package com.juho.leetCode.challenge.y2021.month07.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class BinaryTreePruningTest {

    BinaryTreePruning btp = new BinaryTreePruning();

    @Test
    public void binaryTreePruning01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(0);
        TreeNode root103 = new TreeNode(0);
        TreeNode root104 = new TreeNode(1);
        root101.right = root102;
        root102.left = root103;
        root102.right = root104;

        TreeNode result101 = new TreeNode(1);
        TreeNode result102 = new TreeNode(0);
        TreeNode result103 = new TreeNode(1);
        result101.right = result102;
        result102.right = result103;
        assertEquals(result101.toString(), btp.pruneTree(root101).toString());

        TreeNode root201 = new TreeNode(1);
        TreeNode root202 = new TreeNode(0);
        TreeNode root203 = new TreeNode(1);
        TreeNode root204 = new TreeNode(0);
        TreeNode root205 = new TreeNode(0);
        TreeNode root206 = new TreeNode(0);
        TreeNode root207 = new TreeNode(1);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.left = root206;
        root203.right = root207;

        TreeNode result201 = new TreeNode(1);
        TreeNode result202 = new TreeNode(1);
        TreeNode result203 = new TreeNode(1);
        result201.right = result202;
        result202.right = result203;
        assertEquals(result201.toString(), btp.pruneTree(root201).toString());
    }

}
