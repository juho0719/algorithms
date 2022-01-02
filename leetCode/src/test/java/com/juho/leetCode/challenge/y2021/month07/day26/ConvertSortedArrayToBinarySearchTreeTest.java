package com.juho.leetCode.challenge.y2021.month07.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class ConvertSortedArrayToBinarySearchTreeTest {

    ConvertSortedArrayToBinarySearchTree csabst = new ConvertSortedArrayToBinarySearchTree();

    @Test
    public void convertSortedArrayToBinarySearchTree01Test() {
        int[] nums01 = {-10,-3,0,5,9};

        TreeNode result101 = new TreeNode(0);
        TreeNode result102 = new TreeNode(-10);
        TreeNode result103 = new TreeNode(5);
        TreeNode result104 = new TreeNode(-3);
        TreeNode result105 = new TreeNode(9);
        result101.left = result102;
        result101.right = result103;
        result102.right = result104;
        result103.right = result105;
        assertEquals(result101.toString(), csabst.sortedArrayToBST(nums01).toString());
    }

}
