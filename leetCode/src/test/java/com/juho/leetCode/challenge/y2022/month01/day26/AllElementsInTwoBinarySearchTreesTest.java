package com.juho.leetCode.challenge.y2022.month01.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class AllElementsInTwoBinarySearchTreesTest {
    
    AllElementsInTwoBinarySearchTrees aetbs = new AllElementsInTwoBinarySearchTrees();

    @Test
    public void allElementsInTwoBinarySearchTrees01Test() {
        TreeNode root100 = new TreeNode(2);
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(4);
        root100.left = root101;
        root100.right = root102;
        TreeNode root200 = new TreeNode(1);
        TreeNode root201 = new TreeNode(0);
        TreeNode root202 = new TreeNode(3);
        root200.left = root201;
        root200.right = root202;
        
        List<Integer> result01 = new ArrayList<>();
        result01.add(0);
        result01.add(1);
        result01.add(1);
        result01.add(2);
        result01.add(3);
        result01.add(4);
        assertEquals(result01, aetbs.getAllElements(root100, root200));
    }
}