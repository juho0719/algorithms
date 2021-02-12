package com.juho.leetCode.februaryLeetCodingChallenge.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode2;

import org.junit.jupiter.api.Test;

public class ConvertBSTtoGreaterTreeTest {
    
    ConvertBSTtoGreaterTree cbgt = new ConvertBSTtoGreaterTree();

    @Test
    public void convertBSTtoGreaterTree01Test() {
        TreeNode2 root01Node01 = new TreeNode2(4);
        TreeNode2 root01Node02 = new TreeNode2(1);
        TreeNode2 root01Node03 = new TreeNode2(6);
        TreeNode2 root01Node04 = new TreeNode2(0);
        TreeNode2 root01Node05 = new TreeNode2(2);
        TreeNode2 root01Node06 = new TreeNode2(5);
        TreeNode2 root01Node07 = new TreeNode2(7);
        TreeNode2 root01Node08 = new TreeNode2(3);
        TreeNode2 root01Node09 = new TreeNode2(8);
        root01Node01.left = root01Node02;
        root01Node01.right = root01Node03;
        root01Node02.left = root01Node04;
        root01Node02.right = root01Node05;
        root01Node03.left = root01Node06;
        root01Node03.right = root01Node07;
        root01Node05.right = root01Node08;
        root01Node07.right = root01Node09;

        TreeNode2 result01Node01 = new TreeNode2(30);
        TreeNode2 result01Node02 = new TreeNode2(36);
        TreeNode2 result01Node03 = new TreeNode2(21);
        TreeNode2 result01Node04 = new TreeNode2(36);
        TreeNode2 result01Node05 = new TreeNode2(35);
        TreeNode2 result01Node06 = new TreeNode2(26);
        TreeNode2 result01Node07 = new TreeNode2(15);
        TreeNode2 result01Node08 = new TreeNode2(33);
        TreeNode2 result01Node09 = new TreeNode2(8);
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
