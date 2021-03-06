package com.juho.leetCode.marchLeetCodingChallenge.day05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;
import org.junit.jupiter.api.Test;

public class AverageOfLevelsInBinaryTreeTest {
    
    AverageOfLevelsInBinaryTree albt = new AverageOfLevelsInBinaryTree();

    @Test
    public void averageOfLevelsInBinaryTree01Test() {
        TreeNode treeNode101 = new TreeNode(3);
        TreeNode treeNode102 = new TreeNode(9);
        TreeNode treeNode103 = new TreeNode(20);
        TreeNode treeNode104 = new TreeNode(15);
        TreeNode treeNode105 = new TreeNode(7);
        treeNode101.left = treeNode102;
        treeNode101.right = treeNode103;
        treeNode103.left = treeNode104;
        treeNode103.right = treeNode105;
        List<Double> result01 = new ArrayList<>();
        result01.add((double)3);
        result01.add(14.5);
        result01.add((double)11);

        assertArrayEquals(albt.averageOfLevels(treeNode101).toArray(), result01.toArray());
    }
}
