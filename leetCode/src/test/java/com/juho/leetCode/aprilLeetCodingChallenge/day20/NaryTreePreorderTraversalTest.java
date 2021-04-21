package com.juho.leetCode.aprilLeetCodingChallenge.day20;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.ChildrenNode;

import org.junit.jupiter.api.Test;

public class NaryTreePreorderTraversalTest {

    NaryTreePreorderTraversal ntpt = new NaryTreePreorderTraversal();

    @Test
    public void naryTreePreorderTraversal01Test() {
        ChildrenNode root101 = new ChildrenNode(5);
        ChildrenNode root102 = new ChildrenNode(6);
        List<ChildrenNode> childrenList101 = new ArrayList<>();
        childrenList101.add(root101);
        childrenList101.add(root102);
        ChildrenNode root103 = new ChildrenNode(3, childrenList101);
        ChildrenNode root104 = new ChildrenNode(2);
        ChildrenNode root105 = new ChildrenNode(4);
        List<ChildrenNode> childrenList102 = new ArrayList<>();
        childrenList102.add(root103);
        childrenList102.add(root104);
        childrenList102.add(root105);
        ChildrenNode root106 = new ChildrenNode(1, childrenList102);
        int[] result01 = {1,3,5,6,2,4};
        assertArrayEquals(result01, ntpt.preorder(root106).stream().mapToInt(Integer::intValue).toArray());
    }
}
