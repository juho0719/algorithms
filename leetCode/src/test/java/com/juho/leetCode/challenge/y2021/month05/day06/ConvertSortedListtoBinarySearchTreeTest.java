package com.juho.leetCode.challenge.y2021.month05.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import com.juho.leetCode.datastructure.TreeNode;

import org.junit.jupiter.api.Test;

public class ConvertSortedListtoBinarySearchTreeTest {

    ConvertSortedListtoBinarySearchTree cslbst = new ConvertSortedListtoBinarySearchTree();

    @Test
    public void convertSortedListtoBinarySearchTree01Test() {
        ListNode head101 = new ListNode();
        TreeNode result101 = new TreeNode();
        assertEquals(result101.toString(), cslbst.sortedListToBST(head101).toString());

        ListNode head201 = new ListNode(0);
        TreeNode result201 = new TreeNode(0);
        assertEquals(result201.toString(), cslbst.sortedListToBST(head201).toString());

        // ListNode head301 = new ListNode(1);
        // ListNode head302 = new ListNode(3);
        // head301.next = head302;
        // TreeNode result301 = new TreeNode(3);
        // TreeNode result302 = new TreeNode(1);
        // result301.left = result302;
        // assertEquals(result301.toString(), cslbst.sortedListToBST(head301).toString());
    }

}
