package com.juho.leetCode.jenuaryLeetCodingChallenge.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.jenuaryLeetCodingChallenge.datastructure.TreeNode2;
import org.junit.jupiter.api.Test;

public class VerticalOrderTraversalOfaBinaryTreeTest {

    VerticalOrderTraversalOfaBinaryTree votobt = new VerticalOrderTraversalOfaBinaryTree();

    @Test
    public void verticalOrderTraversalOfaBinaryTreeTest01Test() {
        TreeNode2 root01 = new TreeNode2(3, new TreeNode2(9), new TreeNode2(20, new TreeNode2(15), new TreeNode2(7)));
        
        List<List<Integer>> vResult01 = new ArrayList<>();
        List<Integer> vResult01Detail01 = new ArrayList<>();
        vResult01Detail01.add(9);
        vResult01.add(vResult01Detail01);
        List<Integer> vResult01Detail02 = new ArrayList<>();
        vResult01Detail02.add(3);
        vResult01Detail02.add(15);
        vResult01.add(vResult01Detail02);
        List<Integer> vResult01Detail03 = new ArrayList<>();
        vResult01Detail03.add(20);
        vResult01.add(vResult01Detail03);
        List<Integer> vResult01Detail04 = new ArrayList<>();
        vResult01Detail04.add(7);
        vResult01.add(vResult01Detail04);

        assertEquals(votobt.verticalTraversal(root01), vResult01);
    }
}