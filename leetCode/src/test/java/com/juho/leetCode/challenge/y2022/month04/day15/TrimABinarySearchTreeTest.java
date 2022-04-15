package com.juho.leetCode.challenge.y2022.month04.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class TrimABinarySearchTreeTest {

    TrimABinarySearchTree sbst = new TrimABinarySearchTree();

    @Test
    public void trimABinarySearchTree01Test() {
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(0);
        TreeNode root103 = new TreeNode(4);
        TreeNode root104 = new TreeNode(2);
        TreeNode root105 = new TreeNode(1);
        root101.left = root102;
        root101.right = root103;
        root102.right = root104;
        root104.left = root105;
        int low01 = 1;
        int high01 = 3;

        TreeNode result101 = new TreeNode(3);
        TreeNode result102 = new TreeNode(2);
        TreeNode result103 = new TreeNode(1);
        result101.left = result102;
        result101.right = result103;
        assertEquals(result101.toString(), sbst.trimBST(root101, low01, high01));
        
    }
}