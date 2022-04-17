package com.juho.leetCode.challenge.y2022.month04.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class IncreasingOrderSearchTreeTest {

    @Test
    public void increasingOrderSearchTree01Test() {
        IncreasingOrderSearchTree iost01 = new IncreasingOrderSearchTree();

        TreeNode root101 = new TreeNode(5);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(6);
        TreeNode root104 = new TreeNode(2);
        TreeNode root105 = new TreeNode(4);
        TreeNode root106 = new TreeNode(8);
        TreeNode root107 = new TreeNode(1);
        TreeNode root108 = new TreeNode(7);
        TreeNode root109 = new TreeNode(9);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        root104.left = root107;
        root106.left = root108;
        root106.right = root109;

        TreeNode result101 = new TreeNode(1);
        TreeNode result102 = new TreeNode(2);
        TreeNode result103 = new TreeNode(3);
        TreeNode result104 = new TreeNode(4);
        TreeNode result105 = new TreeNode(5);
        TreeNode result106 = new TreeNode(6);
        TreeNode result107 = new TreeNode(7);
        TreeNode result108 = new TreeNode(8);
        TreeNode result109 = new TreeNode(9);
        result101.right = result102;
        result102.right = result103;
        result103.right = result104;
        result104.right = result105;
        result105.right = result106;
        result106.right = result107;
        result107.right = result108;
        result108.right = result109;

        assertEquals(result101.toString(), iost01.increasingBST(root101).toString());
    }
}