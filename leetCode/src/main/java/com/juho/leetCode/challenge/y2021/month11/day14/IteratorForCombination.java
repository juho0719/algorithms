package com.juho.leetCode.challenge.y2021.month11.day14;

import java.util.ArrayList;
import java.util.List;

/**
 * Design the CombinationIterator class:
 * - CombinationIterator(string characters, int combinationLength) Initializes the object 
 *   with a string characters of sorted distinct lowercase English letters and a number combinationLength as arguments.
 * - next() Returns the next combination of length combinationLength in lexicographical order.
 * - hasNext() Returns true if and only if there exists a next combination.
 * 
 * Example 1:
 * Input
 * ["CombinationIterator", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
 * [["abc", 2], [], [], [], [], [], []]
 * Output
 * [null, "ab", true, "ac", true, "bc", false]
 * Explanation
 * CombinationIterator itr = new CombinationIterator("abc", 2);
 * itr.next();    // return "ab"
 * itr.hasNext(); // return True
 * itr.next();    // return "ac"
 * itr.hasNext(); // return True
 * itr.next();    // return "bc"
 * itr.hasNext(); // return False
 * 
 * Constraints:
 * 1 <= combinationLength <= characters.length <= 15
 * All the characters of characters are unique.
 * At most 104 calls will be made to next and hasNext.
 * It's guaranteed that all calls of the function next are valid.
 */
public class IteratorForCombination {
    List<String> repo;
    String text;
    int itr;

    public IteratorForCombination(String characters, int combinationLength) {
        repo = new ArrayList<>();
        text = "";
        itr = 0;
        helper(characters, combinationLength, 0);    
    }
    
    public String next() {
        return repo.get(itr++);
    }

    public boolean hasNext() {
        return (repo.size() > itr);
    }
    
    void helper(String str, int l, int s){
        if(text.length() == l){
            repo.add( text );
            return ;
        }
        for(int i=s; i<str.length(); i++){
            text += str.charAt(i);
            helper(str, l, i+1);
            text = text.substring(0, text.length()-1);
        }
    }
}