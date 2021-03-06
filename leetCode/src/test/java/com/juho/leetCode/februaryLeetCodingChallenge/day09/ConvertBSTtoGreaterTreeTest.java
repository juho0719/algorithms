package com.juho.leetCode.februaryLeetCodingChallenge.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class ConvertBSTtoGreaterTreeTest {
    
    ConvertBSTtoGreaterTree cbgt = new ConvertBSTtoGreaterTree();

    @Test
    public void convertBSTtoGreaterTree01Test() {
        TreeNode root01Node01 = new TreeNode(4);
        TreeNode root01Node02 = new TreeNode(1);
        TreeNode root01Node03 = new TreeNode(6);
        TreeNode root01Node04 = new TreeNode(0);
        TreeNode root01Node05 = new TreeNode(2);
        TreeNode root01Node06 = new TreeNode(5);
        TreeNode root01Node07 = new TreeNode(7);
        TreeNode root01Node08 = new TreeNode(3);
        TreeNode root01Node09 = new TreeNode(8);
        root01Node01.left = root01Node02;
        root01Node01.right = root01Node03;
        root01Node02.left = root01Node04;
        root01Node02.right = root01Node05;
        root01Node03.left = root01Node06;
        root01Node03.right = root01Node07;
        root01Node05.right = root01Node08;
        root01Node07.right = root01Node09;

        TreeNode result01Node01 = new TreeNode(30);
        TreeNode result01Node02 = new TreeNode(36);
        TreeNode result01Node03 = new TreeNode(21);
        TreeNode result01Node04 = new TreeNode(36);
        TreeNode result01Node05 = new TreeNode(35);
        TreeNode result01Node06 = new TreeNode(26);
        TreeNode result01Node07 = new TreeNode(15);
        TreeNode result01Node08 = new TreeNode(33);
        TreeNode result01Node09 = new TreeNode(8);
        result01Node01.left = result01Node02;
        result01Node01.right = result01Node03;
        result01Node02.left = result01Node04;
        result01Node02.right = result01Node05;
        result01Node03.left = result01Node06;
        result01Node03.right = result01Node07;
        result01Node05.right = result01Node08;
        result01Node07.right = result01Node09;

        cbgt.convertBST(root01Node01);
        assertEquals(root01Node01.toString(), result01Node01.toString());
    }
}
