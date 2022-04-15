package com.juho.leetCode.challenge.y2022.month04.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class SearchInaBinarySearchTreeTest {

    SearchInaBinarySearchTree sbst = new SearchInaBinarySearchTree();

    @Test
    public void searchInaBinarySearchTree01Test() {
        TreeNode root101 = new TreeNode(4);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(7);
        TreeNode root104 = new TreeNode(1);
        TreeNode root105 = new TreeNode(3);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        int val01 = 2;

        TreeNode result101 = new TreeNode(2);
        TreeNode result102 = new TreeNode(1);
        TreeNode result103 = new TreeNode(3);
        result101.left = result102;
        result101.right = result103;
        assertEquals(result101.toString(), sbst.searchBST(root101, val01).toString());
        
    }
}