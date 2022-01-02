package com.juho.leetCode.challenge.y2021.month12.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class HouseRobberIIITest {

    HouseRobberIII hr3 = new HouseRobberIII();

    @Test
    public void houseRobberIII01Test() {
        TreeNode root101 = new TreeNode(3);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        TreeNode root104 = new TreeNode(3);
        TreeNode root105 = new TreeNode(1);
        root101.left = root102;
        root101.right = root103;
        root102.right = root104;
        root103.right = root105;
        assertEquals(7, hr3.rob(root101));

        TreeNode root201 = new TreeNode(3);
        TreeNode root202 = new TreeNode(4);
        TreeNode root203 = new TreeNode(5);
        TreeNode root204 = new TreeNode(1);
        TreeNode root205 = new TreeNode(3);
        TreeNode root206 = new TreeNode(1);
        root201.left = root202;
        root201.right = root203;
        root202.left = root204;
        root202.right = root205;
        root203.right = root206;
        assertEquals(9, hr3.rob(root201));
    }
}