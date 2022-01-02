package com.juho.leetCode.challenge.month11.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class SumOfLeftLeavesTest {

    SumOfLeftLeaves sll = new SumOfLeftLeaves();

    @Test
    public void sumOfLeftLeaves01Test() {
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(9);
        TreeNode root103 = new TreeNode(20);
        TreeNode root104 = new TreeNode(15);
        TreeNode root105 = new TreeNode(7);
        root101.left = root102;
        root101.right = root103;
        root103.left = root104;
        root103.right = root105;
        assertEquals(24, sll.sumOfLeftLeaves(root101));

        TreeNode root201 = new TreeNode(1);
        assertEquals(0, sll.sumOfLeftLeaves(root201));
    }
}