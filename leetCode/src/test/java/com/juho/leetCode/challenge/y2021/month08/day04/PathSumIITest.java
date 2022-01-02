package com.juho.leetCode.challenge.y2021.month08.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class PathSumIITest {

    PathSumII ps2 = new PathSumII();

    @Test
    public void pathSumII01Test() {
        TreeNode root101 = new TreeNode(5);
        TreeNode root102 = new TreeNode(4);
        TreeNode root103 = new TreeNode(8);
        TreeNode root104 = new TreeNode(11);
        TreeNode root105 = new TreeNode(13);
        TreeNode root106 = new TreeNode(4);
        TreeNode root107 = new TreeNode(7);
        TreeNode root108 = new TreeNode(2);
        TreeNode root109 = new TreeNode(5);
        TreeNode root110 = new TreeNode(1);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root103.left = root105;
        root103.right = root106;
        root104.left = root107;
        root104.right = root108;
        root106.left = root109;
        root106.right = root110;

        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(5);
        result101.add(4);
        result101.add(11);
        result101.add(2);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(5);
        result102.add(8);
        result102.add(4);
        result102.add(5);
        result100.add(result102);
        assertEquals(result100, ps2.pathSum(root101, 22));
    }
}
