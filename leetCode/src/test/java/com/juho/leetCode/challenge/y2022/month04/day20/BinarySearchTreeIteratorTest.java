package com.juho.leetCode.challenge.y2022.month04.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeIteratorTest {

    @Test
    public void binarySearchTreeIterator01Test() {
        TreeNode root101 = new TreeNode(7);
        TreeNode root102 = new TreeNode(3);
        TreeNode root103 = new TreeNode(15);
        TreeNode root104 = new TreeNode(9);
        TreeNode root105 = new TreeNode(20);
        root101.left = root102;
        root101.right = root103;
        root103.left = root104;
        root103.right = root105;
        BinarySearchTreeIterator bsti = new BinarySearchTreeIterator(root101);
        assertEquals(3, bsti.next());
        assertEquals(7, bsti.next());
        assertEquals(true, bsti.hasNext());
        assertEquals(9, bsti.next());
        assertEquals(true, bsti.hasNext());
        assertEquals(15, bsti.next());
        assertEquals(true, bsti.hasNext());
        assertEquals(20, bsti.next());
    }
}