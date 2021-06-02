package com.juho.leetCode.challenge.month05.day01;

import java.util.ArrayList;
import java.util.List;

import com.juho.leetCode.datastructure.TrieNode2;

public class PrefixAndSuffixSearch {
    private TrieNode2 pTrie = new TrieNode2();
    private TrieNode2 sTrie = new TrieNode2();
    
    public PrefixAndSuffixSearch(String[] words) {
        for (int index = 0; index < words.length; index++) {
            char[] word = words[index].toCharArray();
            int wlen = word.length;
            insert(word, index, pTrie, 0, wlen, 1);
            insert(word, index, sTrie, wlen-1, -1, -1);
        }
    }
            
    private void insert(char[] word, int index, TrieNode2 trie, int start, int end, int step) {
        for (int i = start; i != end; i += step) {
            int c = word[i] - 'a';
            if (trie.children[c] == null)
                trie.children[c] = new TrieNode2();
            trie = trie.children[c];
            trie.vals.add(index);
        }
    }
    
    private List<Integer> retrieve(char[] word, TrieNode2 trie, int start, int end, int step) {
        for (int i = start; i != end; i += step) {
            trie = trie.children[word[i]-'a'];
            if (trie == null) return new ArrayList<>();
        }
        return trie.vals;
    }
    
    public int f(String pre, String suf) {
        List<Integer> pVals = retrieve(pre.toCharArray(), pTrie, 0, pre.length(), 1);
        List<Integer> sVals = retrieve(suf.toCharArray(), sTrie, suf.length()-1, -1, -1);
        int svix = sVals.size() - 1, pvix = pVals.size() - 1;
        while (svix >= 0 && pvix >= 0) {
            int sVal = sVals.get(svix), pVal = pVals.get(pvix);
            if (sVal == pVal) return sVal;
            if (sVal > pVal) svix--;
            else pvix--;
        }
        return -1;
    }
}