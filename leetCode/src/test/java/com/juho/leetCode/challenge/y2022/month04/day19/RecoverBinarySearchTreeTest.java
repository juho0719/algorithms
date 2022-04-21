package com.juho.leetCode.challenge.y2022.month04.day19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class RecoverBinarySearchTreeTest {

    RecoverBinarySearchTree rbst = new RecoverBinarySearchTree();

    @Test
    public void recoverBinarySearchTree01Test() {

        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(1);
        TreeNode root103 = new TreeNode(4);
        TreeNode root104 = new TreeNode(2);
        root101.left = root102;
        root101.right = root103;
        root103.left = root104;

        TreeNode result101 = new TreeNode(2);
        TreeNode result102 = new TreeNode(1);
        TreeNode result103 = new TreeNode(4);
        TreeNode result104 = new TreeNode(3);
        result101.left = result102;
        result101.right = result103;
        result103.left = result104;

        rbst.recoverTree(root101);
        assertEquals(result101.toString(), root101.toString());
    }
}