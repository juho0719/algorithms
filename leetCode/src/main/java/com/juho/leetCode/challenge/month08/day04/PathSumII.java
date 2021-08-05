package com.juho.leetCode.challenge.month08.day04;

import java.util.ArrayList;
import java.util.List;
import com.juho.leetCode.datastructure.TreeNode;

public class PathSumII {
    public void pathSum(TreeNode root, int targetSum, int sum, List<List<Integer>> res,
                        ArrayList<Integer> li){
      li.add(root.val);
      sum+=root.val;
      if(sum==targetSum && root.left==null && root.right==null){
        res.add(new ArrayList<>(li));
      }
     
      if(root.left!=null)
      {
        pathSum(root.left, targetSum, sum, res, li);
        li.remove(li.size()-1);
      }
      if(root.right!=null){
        pathSum(root.right, targetSum, sum, res, li);
        li.remove(li.size()-1);
      }  
    }
  
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {    
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
          return res;
        pathSum(root, targetSum, 0, res, new ArrayList<Integer>());
        return res;
    }
}