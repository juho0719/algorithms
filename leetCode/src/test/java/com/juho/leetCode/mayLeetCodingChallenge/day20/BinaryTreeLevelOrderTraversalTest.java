package com.juho.leetCode.mayLeetCodingChallenge.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal btot = new BinaryTreeLevelOrderTraversal();
    
    @Test
    public void binaryTreeLevelOrderTraversal01Test() {
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(9);
        TreeNode root103 = new TreeNode(20);
        TreeNode root104 = new TreeNode(15);
        TreeNode root105 = new TreeNode(7);
        root101.left = root102;
        root101.right = root103;
        root103.left = root104;
        root103.right = root105;

        List<List<Integer>> result01 = new ArrayList<>();
        List<Integer> result01Children01 = new ArrayList<>();
        result01Children01.add(3);
        result01.add(result01Children01);
        List<Integer> result01Children02 = new ArrayList<>();
        result01Children02.add(9);
        result01Children02.add(20);
        result01.add(result01Children02);
        List<Integer> result01Children03 = new ArrayList<>();
        result01Children03.add(15);
        result01Children03.add(7);
        result01.add(result01Children03);
        assertEquals(result01, btot.levelOrder(root101));
    }
}