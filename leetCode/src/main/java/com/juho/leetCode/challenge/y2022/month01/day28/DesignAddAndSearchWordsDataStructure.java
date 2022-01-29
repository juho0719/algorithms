package com.juho.leetCode.challenge.y2022.month01.day28;

/**
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * Implement the WordDictionary class:
 * - WordDictionary() Initializes the object.
 * - void addWord(word) Adds word to the data structure, it can be matched later.
 * - bool search(word) Returns true if there is any string in the data structure 
 *   that matches word or false otherwise. word may contain dots '.' where dots can be matched with any letter.
 * 
 * Example 1:
 * Input
 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * Output
 * [null,null,null,null,false,true,true,true]
 * Explanation
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 * 
 * Constraints:
 * 1 <= word.length <= 500
 * word in addWord consists lower-case English letters.
 * word in search consist of  '.' or lower-case English letters.
 * At most 50000 calls will be made to addWord and search.
 */

public class DesignAddAndSearchWordsDataStructure {
    private DesignAddAndSearchWordsDataStructure[] children;
    boolean isEndOfWord;
    public DesignAddAndSearchWordsDataStructure() {
        children = new DesignAddAndSearchWordsDataStructure[26];
        isEndOfWord = false;
    }
    
    public void addWord(String word) {
        DesignAddAndSearchWordsDataStructure curr = this;
        for(char c: word.toCharArray()){
            if(curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new DesignAddAndSearchWordsDataStructure();
            curr = curr.children[c - 'a'];
        }
        curr.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        DesignAddAndSearchWordsDataStructure curr = this;
        for(int i = 0; i < word.length(); ++i){
            char c = word.charAt(i);
            if(c == '.'){
                for(DesignAddAndSearchWordsDataStructure ch: curr.children)
                    if(ch != null && ch.search(word.substring(i+1))) return true;
                return false;
            }
            if(curr.children[c - 'a'] == null) return false;
            curr = curr.children[c - 'a'];
        }
        return curr != null && curr.isEndOfWord;
    }
}