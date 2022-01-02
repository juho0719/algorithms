package com.juho.leetCode.challenge.month10.day17;

import java.util.HashMap;
import java.util.Map;

import com.juho.leetCode.datastructure.TreeNode;

/**
 * Given the root of a binary tree and an integer targetSum, 
 * return the number of paths where the sum of the values along the path equals targetSum.
 * The path does not need to start or end at the root or a leaf, 
 * but it must go downwards (i.e., traveling only from parent nodes to child nodes).
 * 
 * Example 1:
 * Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * Output: 3
 * Explanation: The paths that sum to 8 are shown.
 * 
 * Example 2:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: 3
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [0, 1000].
 * -10^9 <= Node.val <= 10^9
 * -1000 <= targetSum <= 1000
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null)
            return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return helper(root, 0, targetSum, map);
    }
    
    public int helper(TreeNode root, int current, int target, Map<Integer, Integer> map) {
        if(root == null)
            return 0;
        
        current += root.val;
        int count = 0;
        
        count += map.getOrDefault(current - target, 0);
        map.put(current, map.getOrDefault(current, 0) + 1);
        
        count += helper(root.left, current, target, map);
        count += helper(root.right, current, target, map);
        
        map.put(current, map.get(current) - 1);
        return count;
    }
}