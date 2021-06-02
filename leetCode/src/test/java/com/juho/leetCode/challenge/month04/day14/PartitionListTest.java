package com.juho.leetCode.challenge.month04.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.ListNode;
import org.junit.jupiter.api.Test;

public class PartitionListTest {

    PartitionList pl = new PartitionList();

    @Test
    public void partitionList01Test() {
        ListNode root101 = new ListNode(1);
        ListNode root102 = new ListNode(4);
        ListNode root103 = new ListNode(3);
        ListNode root104 = new ListNode(2);
        ListNode root105 = new ListNode(5);
        ListNode root106 = new ListNode(2);
        root101.next = root102;
        root102.next = root103;
        root103.next = root104;
        root104.next = root105;
        root105.next = root106;

        ListNode result101 = new ListNode(1);
        ListNode result102 = new ListNode(2);
        ListNode result103 = new ListNode(2);
        ListNode result104 = new ListNode(4);
        ListNode result105 = new ListNode(3);
        ListNode result106 = new ListNode(5);
        result101.next = result102;
        result102.next = result103;
        result103.next = result104;
        result104.next = result105;
        result105.next = result106;
        assertEquals(result101.toString(), pl.partition(root101, 3).toString());


        ListNode root201 = new ListNode(2);
        ListNode root202 = new ListNode(1);
        root201.next = root202;

        ListNode result201 = new ListNode(1);
        ListNode result202 = new ListNode(2);
        result201.next = result202;
        assertEquals(result201.toString(), pl.partition(root201, 2).toString());
    }
}
