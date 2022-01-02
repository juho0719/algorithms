package com.juho.leetCode.challenge.month02.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class BinaryTreeRightSideViewTest {
    
    BinaryTreeRightSideView btrsv = new BinaryTreeRightSideView();

    @Test
    public void binaryTreeRightSideView01Test() {
        TreeNode root01Node01 = new TreeNode(1);
        TreeNode root01Node02 = new TreeNode(2);
        TreeNode root01Node03 = new TreeNode(3);
        TreeNode root01Node04 = new TreeNode(4);
        TreeNode root01Node05 = new TreeNode(5);
        root01Node01.left = root01Node02;
        root01Node01.right = root01Node03;
        root01Node02.right = root01Node05;
        root01Node03.right = root01Node04;
        List<Integer> result01 = new ArrayList<>();
        result01.add(1);
        result01.add(3);
        result01.add(4);
        assertEquals(btrsv.rightSideView(root01Node01), result01);
    }
}
