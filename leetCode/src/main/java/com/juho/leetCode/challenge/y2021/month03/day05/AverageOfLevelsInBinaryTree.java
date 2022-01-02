package com.juho.leetCode.challenge.y2021.month03.day05;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TreeNode;

public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> results = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        results.add((double)root.val);
        counts.add(1);
        average(results, counts, root.left, 1);
        average(results, counts, root.right, 1);

        for(int i=0; i<results.size(); i++) {
            results.set(i, results.get(i) / counts.get(i));
        }
        return results;
    }

    private void average(List<Double> results, List<Integer> counts, TreeNode node, int depth) {
        if(node == null) return;
        if(depth < results.size()) {
            results.set(depth, results.get(depth)+node.val);
            counts.set(depth, counts.get(depth)+1);
        } else {
            results.add((double) node.val);
            counts.add(1);
        }
        average(results, counts, node.left, depth+1);
        average(results, counts, node.right, depth+1);
    }
}