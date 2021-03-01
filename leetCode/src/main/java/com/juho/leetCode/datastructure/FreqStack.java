package com.juho.leetCode.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FreqStack {
    Map<Integer, Integer> freq;
    Map<Integer, Stack<Integer>> freqCountGroup;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();    
        freqCountGroup = new HashMap<>();    
        maxFreq = 0;
    }
    
    public void push(int x) {
        int count = freq.getOrDefault(x, 0) + 1;
        freq.put(x, count);
        if(count > maxFreq) maxFreq = count;

        freqCountGroup.computeIfAbsent(count, c->new Stack<>()).push(x);
    }
    
    public int pop() {
        int x = freqCountGroup.get(maxFreq).pop();
        freq.put(x, freq.get(x)-1);
        if(freqCountGroup.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return x;
    }
}
