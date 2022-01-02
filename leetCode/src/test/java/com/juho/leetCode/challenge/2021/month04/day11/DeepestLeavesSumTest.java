package com.juho.leetCode.challenge.month04.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class DeepestLeavesSumTest {

    DeepestLeavesSum dls = new DeepestLeavesSum();

    @Test
    public void deepestLeavesSum01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(4);
        TreeNode root105 = new TreeNode(5);
        TreeNode root106 = new TreeNode(6);
        TreeNode root107 = new TreeNode(7);
        TreeNode root108 = new TreeNode(8);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        root104.left = root107;
        root106.right = root108;
        assertEquals(15, dls.deepestLeavesSum(root101));

        TreeNode root201 = new TreeNode(6);
        TreeNode root202 = new TreeNode(7);
        TreeNode root203 = new TreeNode(8);
        TreeNode root204 = new TreeNode(2);
        TreeNode root205 = new TreeNode(7);
        TreeNode root206 = new TreeNode(1);
        TreeNode root207 = new TreeNode(3);
        TreeNode root208 = new TreeNode(9);
        TreeNode root209 = new TreeNode(1);
        TreeNode root210 = new TreeNode(4);
        TreeNode root211 = new TreeNode(5);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.left = root206;
        root203.right = root207;
        root204.left = root208;
        root205.left = root209;
        root205.right = root210;
        root207.right = root211;
        assertEquals(19, dls.deepestLeavesSum(root201));
    }
}
