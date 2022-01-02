package com.juho.leetCode.challenge.y2021.month08.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NaryTreeLevelOrderTraversalTest {

    NaryTreeLevelOrderTraversal ntlot = new NaryTreeLevelOrderTraversal();

    @Test
    public void naryTreeLevelOrderTraversal01Test() {
        Node root101 = new Node(1);
        Node root102 = new Node(3);
        Node root103 = new Node(2);
        Node root104 = new Node(4);
        Node root105 = new Node(5);
        Node root106 = new Node(6);
        List<Node> root101Children = new ArrayList<>();
        root101Children.add(root102);
        root101Children.add(root103);
        root101Children.add(root104);
        root101.children = root101Children;
        List<Node> root102Children = new ArrayList<>();
        root102Children.add(root105);
        root102Children.add(root106);
        root102.children = root102Children;
        
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(1);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(3);
        result102.add(2);
        result102.add(4);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(5);
        result103.add(6);
        result100.add(result103);

        assertEquals(result100, ntlot.levelOrder(root101));
    }
}
