package com.juho.leetCode.challenge.y2022.month01.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class InsertIntoaBinarySearchTreeTest {

    InsertIntoaBinarySearchTree ibst = new InsertIntoaBinarySearchTree();

    @Test
    public void insertIntoaBinarySearchTree01Test() {
        TreeNode root101 = new TreeNode(4);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(7);
        TreeNode root104 = new TreeNode(1);
        TreeNode root105 = new TreeNode(3);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        int val01 = 5;
        TreeNode result101 = new TreeNode(4);
        TreeNode result102 = new TreeNode(2);
        TreeNode result103 = new TreeNode(7);
        TreeNode result104 = new TreeNode(1);
        TreeNode result105 = new TreeNode(3);
        TreeNode result106 = new TreeNode(5);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result102.right = result105;
        result103.left = result106;
        assertEquals(result101.toString(), ibst.insertIntoBST(root101, val01));
    }
}