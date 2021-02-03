package com.juho.leetCode.februaryLeetCodingChallenge.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode2;

import org.junit.jupiter.api.Test;

public class TrimABinarySearchTreeTest {
    
    TrimABinarySearchTree tbst = new TrimABinarySearchTree();

    @Test
    public void trimABinarySearchTree01Test() {
        TreeNode2 root01Node01 = new TreeNode2(1);
        TreeNode2 root01Node02 = new TreeNode2(0);
        TreeNode2 root01Node03 = new TreeNode2(2);
        root01Node01.left = root01Node02;
        root01Node01.right = root01Node03;

        TreeNode2 result01Node01 = new TreeNode2(1);
        TreeNode2 result01Node02 = new TreeNode2(2);
        result01Node01.right = result01Node02;
        assertEquals(tbst.trimBST(root01Node01, 1, 2).toString(), result01Node01.toString());
    }
}
