package com.juho.leetCode.challenge.y2022.month04.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class ConvertBSTtoGreaterTreeTest {

    ConvertBSTtoGreaterTree cbgt = new ConvertBSTtoGreaterTree();

    @Test
    public void convertBSTtoGreaterTree01Test() {
        TreeNode root101 = new TreeNode(4);
        TreeNode root102 = new TreeNode(1);
        TreeNode root103 = new TreeNode(6);
        TreeNode root104 = new TreeNode(0);
        TreeNode root105 = new TreeNode(2);
        TreeNode root106 = new TreeNode(5);
        TreeNode root107 = new TreeNode(7);
        TreeNode root108 = new TreeNode(3);
        TreeNode root109 = new TreeNode(8);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.left = root106;
        root103.right = root107;
        root105.right = root108;
        root107.right = root109;

        TreeNode result101 = new TreeNode(30);
        TreeNode result102 = new TreeNode(36);
        TreeNode result103 = new TreeNode(21);
        TreeNode result104 = new TreeNode(36);
        TreeNode result105 = new TreeNode(35);
        TreeNode result106 = new TreeNode(26);
        TreeNode result107 = new TreeNode(15);
        TreeNode result108 = new TreeNode(33);
        TreeNode result109 = new TreeNode(8);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result102.right = result105;
        result103.left = result106;
        result103.right = result107;
        result105.right = result108;
        result107.right = result109;

        assertEquals(result101.toString(), cbgt.convertBST(root101).toString());
    }
}