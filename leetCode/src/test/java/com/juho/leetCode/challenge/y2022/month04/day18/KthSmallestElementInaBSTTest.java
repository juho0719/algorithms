package com.juho.leetCode.challenge.y2022.month04.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class KthSmallestElementInaBSTTest {

    KthSmallestElementInaBST kbst = new KthSmallestElementInaBST();

    @Test
    public void kthSmallestElementInaBST01Test() {

        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(1);
        TreeNode root103 = new TreeNode(4);
        TreeNode root104 = new TreeNode(2);
        root101.left = root102;
        root101.right = root103;
        root102.right = root104;
        int k01 = 1;
        assertEquals(1, kbst.kthSmallest(root101, k01));
    }
}