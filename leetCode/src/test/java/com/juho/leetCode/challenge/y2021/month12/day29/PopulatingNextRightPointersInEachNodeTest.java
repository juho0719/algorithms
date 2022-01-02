package com.juho.leetCode.challenge.y2021.month12.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.juho.leetCode.datastructure.Node3;

import org.junit.jupiter.api.Test;

public class PopulatingNextRightPointersInEachNodeTest {

    PopulatingNextRightPointersInEachNode pnrp = new PopulatingNextRightPointersInEachNode();

    @Test
    public void populatingNextRightPointersInEachNode01Test() {
        Node3 root100 = new Node3(1);
        Node3 root101 = new Node3(2);
        Node3 root102 = new Node3(3);
        Node3 root111 = new Node3(4);
        Node3 root112 = new Node3(5);
        Node3 root113 = new Node3(6);
        Node3 root114 = new Node3(7);
        root100.left = root101;
        root100.right = root102;
        root101.left = root111;
        root101.right = root112;
        root102.left = root113;
        root102.right = root114;

        Node3 result100 = new Node3(1);
        Node3 result101 = new Node3(2);
        Node3 result102 = new Node3(3);
        Node3 result111 = new Node3(4);
        Node3 result112 = new Node3(5);
        Node3 result113 = new Node3(6);
        Node3 result114 = new Node3(7);
        result100.left = result101;
        result100.right = result102;
        result100.next = null;
        result101.left = result111;
        result101.right = result112;
        result101.next = result102;
        result102.left = result113;
        result102.right = result114;
        result102.next = null;
        result111.next = result112;
        result112.next = result113;
        result113.next = result114;
        result114.next = null;
        assertEquals(result100.toString(), pnrp.connect(root100).toString());
    }
}