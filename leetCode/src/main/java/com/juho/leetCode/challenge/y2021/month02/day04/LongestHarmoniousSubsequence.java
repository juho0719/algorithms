package com.juho.leetCode.challenge.y2021.month02.day04;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.get(num)==null?1:map.get(num)+1);
            if(map.containsKey(num+1)) {
                int currentCount = map.get(num) + map.get(num+1);
                if(result < currentCount) {
                    result = currentCount;
                }
            }
            if(map.containsKey(num-1)) {
                int currentCount = map.get(num) + map.get(num-1);
                if(result < currentCount) {
                    result = currentCount;
                }
            }
        }
        return result;
    }
}
