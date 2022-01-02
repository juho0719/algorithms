package com.juho.leetCode.challenge.y2021.month01.day21;

import java.util.Stack;

public class FindTheMostCompetitiveSubsequence {
    
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> numsStack = new Stack<>();

        for(int i=0; i<nums.length; i++) {
            if(numsStack.isEmpty()) numsStack.add(nums[i]);
            else {
                while(!numsStack.isEmpty() && numsStack.peek() > nums[i] && nums.length-i+numsStack.size()>k) {
                    numsStack.pop();
                }
                if(numsStack.size() < k) {
                    numsStack.push(nums[i]);
                }
            }
        }
        return numsStack.stream().mapToInt(i->i).toArray();
    }
}