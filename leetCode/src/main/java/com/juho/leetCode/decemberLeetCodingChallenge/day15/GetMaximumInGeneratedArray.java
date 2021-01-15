package com.juho.leetCode.decemberLeetCodingChallenge.day15;

public class GetMaximumInGeneratedArray {
    
    public int getMaximumGenerated(int n) {
        int max = 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        numsMap.put(0, 0);
        numsMap.put(1, 1);
        if(n <= 1) return numsMap.get(n);

        for(int i=1; i<=n; i++) {
            int numsKey = i*2;
            numsMap.put(numsKey, numsMap.get(numsKey/2));
            if(numsMap.get(numsKey) > max) {
                max = numsMap.get(numsKey);
            }
            if(numsKey == n) break;

            numsMap.put(numsKey + 1, numsMap.get(numsKey/2) + numsMap.get(numsKey/2 + 1));
            if(numsMap.get(numsKey + 1) > max) {
                max = numsMap.get(numsKey + 1);
            }
            if(numsKey + 1 == n) break;
        }
        return max;
    }
}