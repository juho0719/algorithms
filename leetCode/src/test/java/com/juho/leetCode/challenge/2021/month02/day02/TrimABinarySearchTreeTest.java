package com.juho.leetCode.challenge.month02.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class TrimABinarySearchTreeTest {
    
    TrimABinarySearchTree tbst = new TrimABinarySearchTree();

    @Test
    public void trimABinarySearchTree01Test() {
        TreeNode root01Node01 = new TreeNode(1);
        TreeNode root01Node02 = new TreeNode(0);
        TreeNode root01Node03 = new TreeNode(2);
        root01Node01.left = root01Node02;
        root01Node01.right = root01Node03;

        TreeNode result01Node01 = new TreeNode(1);
        TreeNode result01Node02 = new TreeNode(2);
        result01Node01.right = result01Node02;
        assertEquals(tbst.trimBST(root01Node01, 1, 2).toString(), result01Node01.toString());
    }
}
