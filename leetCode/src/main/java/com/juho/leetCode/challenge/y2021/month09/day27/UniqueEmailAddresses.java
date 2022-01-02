package com.juho.leetCode.challenge.y2021.month09.day27;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        int uniqueEmailCount = 0;
        Trie words = new Trie();
        for(String email: emails) {
            boolean crossedAsterick = false;
            boolean hasPlus = false;
            Trie curWord = words;
            for(int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if(c == '@') {
                    if(curWord.trie[26] == null) curWord.trie[26] = new Trie(); 
                    curWord = curWord.trie[26];
                    crossedAsterick = true;
                }
                else if(c == '+') {
                    if(!crossedAsterick) {
                        hasPlus = true;
                    }
                    else {
                        if(curWord.trie[27] == null) curWord.trie[27] = new Trie(); 
                        curWord = curWord.trie[27];
                    }
                }
                else if(c == '.') {
                    if(!crossedAsterick) continue;                   
                    else {
                        if(curWord.trie[28] == null) curWord.trie[28] = new Trie(); 
                        curWord = curWord.trie[28];
                    }
                }
                else {
                    if(hasPlus && !crossedAsterick) continue;
                    if(curWord.trie[c - 'a'] == null) curWord.trie[c - 'a'] = new Trie(); 
                    curWord = curWord.trie[c - 'a'];
                }
            }
            if(curWord.end != true) {
                curWord.end = true;
                uniqueEmailCount ++;
            }
        }
        return uniqueEmailCount;
    }
}

class Trie {
    Trie[] trie;
    boolean end = false;
    Trie() {
        trie = new Trie[29];
    }
}