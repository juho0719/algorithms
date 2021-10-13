package com.juho.leetCode.challenge.month10.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class ConstructBinarySearchTreeFromPreorderTraversalTest {

    ConstructBinarySearchTreeFromPreorderTraversal cbstpt = new  ConstructBinarySearchTreeFromPreorderTraversal();

    @Test
    public void constructBinarySearchTreeFromPreorderTraversal01Test() {
        int[] preorder01 = {8,5,1,7,10,12};
        TreeNode result101 = new TreeNode(8);
        TreeNode result102 = new TreeNode(5);
        TreeNode result103 = new TreeNode(10);
        TreeNode result104 = new TreeNode(1);
        TreeNode result105 = new TreeNode(7);
        TreeNode result106 = new TreeNode(12);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result102.right = result105;
        result103.right = result106;
        assertEquals(result101.toString(), cbstpt.bstFromPreorder(preorder01).toString());
    }
}