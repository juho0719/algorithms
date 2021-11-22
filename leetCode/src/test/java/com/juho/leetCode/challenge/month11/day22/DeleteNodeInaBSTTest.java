package com.juho.leetCode.challenge.month11.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class DeleteNodeInaBSTTest {

    DeleteNodeInaBST dnbst = new DeleteNodeInaBST();

    @Test
    public void deleteNodeInaBST01Test() {
        TreeNode root101 = new TreeNode(5);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(6);
        TreeNode root104 = new TreeNode(2);
        TreeNode root105 = new TreeNode(4);
        TreeNode root106 = new TreeNode(7);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;

        TreeNode result101 = new TreeNode(5);
        TreeNode result102 = new TreeNode(4);
        TreeNode result103 = new TreeNode(6);
        TreeNode result104 = new TreeNode(2);
        TreeNode result105 = new TreeNode(7);
        result101.left = result102;
        result101.right = result103;
        result102.left = result104;
        result103.right = result105;

        assertEquals(result101.toString(), dnbst.deleteNode(root101, 3));
    }
}