package com.juho.leetCode.challenge.month05.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class FlattenBinaryTreeToLinkedListTest {

    FlattenBinaryTreeToLinkedList fbtll = new FlattenBinaryTreeToLinkedList();
    
    @Test
    public void ambiguousCoordinates01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(5);
        TreeNode root104 = new TreeNode(3);
        TreeNode root105 = new TreeNode(4);
        TreeNode root106 = new TreeNode(6);
        root101.left = root102;
        root101.right = root103;
        root102.left = root104;
        root102.right = root105;
        root103.right = root106;
        
        TreeNode result101 = new TreeNode(1);
        TreeNode result102 = new TreeNode(2);
        TreeNode result103 = new TreeNode(3);
        TreeNode result104 = new TreeNode(4);
        TreeNode result105 = new TreeNode(5);
        TreeNode result106 = new TreeNode(6);
        result101.right = result102;
        result102.right = result103;
        result103.right = result104;
        result104.right = result105;
        result105.right = result106;
        fbtll.flatten(root101);
        assertEquals(result101.toString(), root101.toString());
    }
}