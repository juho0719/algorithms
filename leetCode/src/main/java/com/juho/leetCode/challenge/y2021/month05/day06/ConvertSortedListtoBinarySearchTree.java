package com.juho.leetCode.challenge.y2021.month05.day06;

import com.juho.leetCode.datastructure.ListNode;
import com.juho.leetCode.datastructure.TreeNode;

public class ConvertSortedListtoBinarySearchTree {
    ListNode curr;
    public TreeNode sortedListToBST(ListNode head) {
        int count = 0;
        curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        curr = head;
        return treeify(1, count);
    }
    private TreeNode treeify(int i, int j) {
        if (j < i) return null;
        int mid = i + j >> 1;
        TreeNode node = new TreeNode();
        node.left = treeify(i, mid - 1);
        node.val = curr.val;
        curr = curr.next;
        node.right = treeify(mid + 1, j);
        return node;
    }
}