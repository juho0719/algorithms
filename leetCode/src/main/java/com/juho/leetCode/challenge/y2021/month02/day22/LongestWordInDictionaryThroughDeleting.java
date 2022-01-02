package com.juho.leetCode.challenge.y2021.month02.day22;

import java.util.List;
import java.util.PriorityQueue;

public class LongestWordInDictionaryThroughDeleting {
    
    public String findLongestWord(String s, List<String> d) {
        PriorityQueue<String> longestWords = new PriorityQueue<>((w1, w2) ->  w1.length() != w2.length() ? w2.length() - w1.length() : w1.compareTo(w2));
        for(String dicWord : d) {
            int dicWordIndex = 0;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == dicWord.charAt(dicWordIndex)) {
                    if(dicWordIndex == dicWord.length()-1) {
                        longestWords.add(dicWord);
                        break;
                    }
                    dicWordIndex++;
                }
            }
        }
        String result = longestWords.poll();
        return result==null?"":result;
    }
}
