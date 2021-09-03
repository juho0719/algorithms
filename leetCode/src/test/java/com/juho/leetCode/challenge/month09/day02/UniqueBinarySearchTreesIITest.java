package com.juho.leetCode.challenge.month09.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class UniqueBinarySearchTreesIITest {

    UniqueBinarySearchTreesII ubst2 = new UniqueBinarySearchTreesII();

    @Test
    public void uniqueBinarySearchTreesII01Test() {
        int n01 = 3;
        List<TreeNode> result01 = new ArrayList<>();
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        TreeNode root103 = new TreeNode(3);
        root101.right = root102;
        root102.right = root103;
        result01.add(root101);

        TreeNode root201 = new TreeNode(1);
        TreeNode root202 = new TreeNode(3);
        TreeNode root203 = new TreeNode(2);
        root201.right = root202;
        root202.left = root203;
        result01.add(root201);
        
        TreeNode root301 = new TreeNode(2);
        TreeNode root302 = new TreeNode(1);
        TreeNode root303 = new TreeNode(3);
        root301.left = root302;
        root301.right = root303;
        result01.add(root301);

        TreeNode root401 = new TreeNode(3);
        TreeNode root402 = new TreeNode(1);
        TreeNode root403 = new TreeNode(2);
        root401.left = root402;
        root402.right = root403;
        result01.add(root401);

        TreeNode root501 = new TreeNode(3);
        TreeNode root502 = new TreeNode(2);
        TreeNode root503 = new TreeNode(1);
        root501.left = root502;
        root502.left = root503;
        result01.add(root501);
        
        assertEquals(result01.toString(), ubst2.generateTrees(n01).toString());
    }
}