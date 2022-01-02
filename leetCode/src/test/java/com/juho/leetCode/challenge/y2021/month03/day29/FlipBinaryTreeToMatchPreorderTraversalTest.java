package com.juho.leetCode.challenge.y2021.month03.day29;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class FlipBinaryTreeToMatchPreorderTraversalTest {
    
    FlipBinaryTreeToMatchPreorderTraversal ftmpt = new FlipBinaryTreeToMatchPreorderTraversal();

    @Test
    public void flipBinaryTreeToMatchPreorderTraversal01Test() {
        TreeNode root101 = new TreeNode(1);
        TreeNode root102 = new TreeNode(2);
        root101.left = root102;
        int[] voyage01 = {2,1};
        int[] result01 = {-1};

        assertArrayEquals(result01, ftmpt.flipMatchVoyage(root101, voyage01).stream().mapToInt(i->i).toArray());

        TreeNode root201 = new TreeNode(1);
        TreeNode root202 = new TreeNode(2);
        TreeNode root203 = new TreeNode(3);
        root201.left = root202;
        root201.right = root203;
        int[] voyage02 = {1,3,2};
        int[] result02 = {1};

        assertArrayEquals(result02, ftmpt.flipMatchVoyage(root201, voyage02).stream().mapToInt(i->i).toArray());
    }
}
