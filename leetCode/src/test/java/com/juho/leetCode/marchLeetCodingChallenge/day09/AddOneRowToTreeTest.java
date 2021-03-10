package com.juho.leetCode.marchLeetCodingChallenge.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class AddOneRowToTreeTest {
    
    AddOneRowToTree aort = new AddOneRowToTree();

    @Test
    public void addOneRowToTree01Test() {
        TreeNode node101 = new TreeNode(4);
        TreeNode node102 = new TreeNode(2);
        TreeNode node103 = new TreeNode(6);
        TreeNode node104 = new TreeNode(3);
        TreeNode node105 = new TreeNode(1);
        TreeNode node106 = new TreeNode(5);
        node101.left = node102;
        node101.right = node103;
        node102.left = node104;
        node102.right = node105;
        node103.left = node106;

        TreeNode result101 = new TreeNode(4);
        TreeNode result102 = new TreeNode(1);
        TreeNode result103 = new TreeNode(1);
        TreeNode result104 = new TreeNode(2);
        TreeNode result105 = new TreeNode(6);
        TreeNode result106 = new TreeNode(3);
        TreeNode result107 = new TreeNode(1);
        TreeNode result108 = new TreeNode(5);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result103.right = result105;
        result104.left = result106;
        result104.right = result107;
        result105.left = result108;

        assertEquals(aort.addOneRow(node101, 1, 2).toString(), result101.toString());
    }
}
