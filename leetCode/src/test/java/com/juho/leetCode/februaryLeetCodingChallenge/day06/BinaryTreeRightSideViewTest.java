package com.juho.leetCode.februaryLeetCodingChallenge.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode2;
import org.junit.jupiter.api.Test;

public class BinaryTreeRightSideViewTest {
    
    BinaryTreeRightSideView btrsv = new BinaryTreeRightSideView();

    @Test
    public void binaryTreeRightSideView01Test() {
        TreeNode2 root01Node01 = new TreeNode2(1);
        TreeNode2 root01Node02 = new TreeNode2(2);
        TreeNode2 root01Node03 = new TreeNode2(3);
        TreeNode2 root01Node04 = new TreeNode2(4);
        TreeNode2 root01Node05 = new TreeNode2(5);
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
