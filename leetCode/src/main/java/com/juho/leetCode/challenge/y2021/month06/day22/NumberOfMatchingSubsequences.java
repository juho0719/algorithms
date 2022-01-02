package com.juho.leetCode.challenge.y2021.month06.day22;

import java.util.ArrayList;

public class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        ArrayList<Node>[] buckets = new ArrayList[26];
        for (int i = 0; i < 26; ++i) buckets[i] = new ArrayList<>();
        for (String word : words) {
            int bucketIndex = word.charAt(0) - 'a';
            buckets[bucketIndex].add(new Node(word, 0));
        }
        int ans = 0;
        for (char c : s.toCharArray()) {
            int bucketIdx = c - 'a';
            ArrayList<Node> currBucket = buckets[bucketIdx];
            buckets[bucketIdx] = new ArrayList<>();
            for (Node node : currBucket) {
                node.index += 1; // Point to next character of node.word
                if (node.index == node.word.length()) {
                    ans += 1;
                } else {
                    bucketIdx = node.word.charAt(node.index) - 'a';
                    buckets[bucketIdx].add(node);
                }
            }
        }
        return ans;
    }
    class Node {
        String word;
        int index;
        Node(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}