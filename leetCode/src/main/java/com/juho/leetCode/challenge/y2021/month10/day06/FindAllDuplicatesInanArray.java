package com.juho.leetCode.challenge.y2021.month10.day06;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) res.add(idx + 1);
            
            nums[idx] *= -1;
        }
        return res;
    }
}