package com.juho.leetCode.challenge.y2021.month09.day22;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfaConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        Set<Integer> optSet = new HashSet<>();
        for (String word : arr) 
            wordToBitSet(optSet, word);
        
        int[] optArr = new int[optSet.size()];
        int i = 0;
        for (Integer num : optSet)
            optArr[i++] = num;
        return dfs(optArr, 0, 0);
    }
    
    private void wordToBitSet(Set<Integer> optSet, String word) {
        int charBitSet = 0;
        for (char c : word.toCharArray()) {
            int mask = 1 << c - 'a';
            if ((charBitSet & mask) > 0)
                return;
            charBitSet += mask;
        }
        optSet.add(charBitSet + (word.length() << 26));
    }
    
    private int dfs(int[] optArr, int pos, int res) {
        int oldChars = res & ((1 << 26) - 1);
        int oldLen = res >> 26;
        int best = oldLen;
        
        for (int i = pos; i < optArr.length; i++) {
            int newChars = optArr[i] & ((1 << 26) - 1);
            int newLen = optArr[i] >> 26;
            
            if ((newChars & oldChars) != 0)
                continue;
            
            int newRes = newChars + oldChars + (newLen + oldLen << 26);
            best = Math.max(best, dfs(optArr, i + 1, newRes));
        }
        return best;
    }
}