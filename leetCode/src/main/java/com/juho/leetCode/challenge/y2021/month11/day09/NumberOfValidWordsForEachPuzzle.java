package com.juho.leetCode.challenge.y2021.month11.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:
 * - word contains the first letter of puzzle.
 * - For each letter in word, that letter is in puzzle.
 *   - For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage", while
 *   - invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).
 * Return an array answer, where answer[i] is the number of words in the given word list words that is valid with respect to the puzzle puzzles[i].
 * 
 * Example 1:
 * Input: words = ["aaaa","asas","able","ability","actt","actor","access"], puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
 * Output: [1,1,3,2,4,0]
 * Explanation: 
 * 1 valid word for "aboveyz" : "aaaa" 
 * 1 valid word for "abrodyz" : "aaaa"
 * 3 valid words for "abslute" : "aaaa", "asas", "able"
 * 2 valid words for "absoryz" : "aaaa", "asas"
 * 4 valid words for "actresz" : "aaaa", "asas", "actt", "access"
 * There are no valid words for "gaswxyz" cause none of the words in the list contains letter 'g'.
 * 
 * Example 2:
 * Input: words = ["apple","pleas","please"], puzzles = ["aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"]
 * Output: [0,1,3,2,0]
 * 
 * Constraints:
 * 1 <= words.length <= 10^5
 * 4 <= words[i].length <= 50
 * 1 <= puzzles.length <= 10^4
 * puzzles[i].length == 7
 * words[i] and puzzles[i] consist of lowercase English letters.
 * Each puzzles[i] does not contain repeated characters.
 */
public class NumberOfValidWordsForEachPuzzle {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        int SIZE = 26;
        List<Integer[]> trie = new ArrayList<>();
        trie.add(Collections.nCopies(SIZE, 0).toArray(new Integer[0]));
        List<Integer> count = new ArrayList<>(List.of(0));
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder();
            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
            if (sb.length() <= 7) {
                int node = 0;
                for (char letter : sb.toString().toCharArray()) {
                    int i = letter - 'a';
                    if (trie.get(node)[i] == 0) {
                        trie.add(Collections.nCopies(SIZE, 0).toArray(new Integer[0]));
                        count.add(0);
                        trie.get(node)[i] = trie.size() - 1;
                    }
                    node = trie.get(node)[i];
                }
                count.set(node, count.get(node) + 1);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (String puzzle : puzzles) {
            result.add(dfs(0, false, puzzle, trie, count));
        }
        return result;
    }

    int dfs(int node, boolean hasFirst, String puzzle, List<Integer[]> trie, List<Integer> cnt) {
        int total = hasFirst ? cnt.get(node) : 0;
        for (char letter : puzzle.toCharArray()) {
            int i = letter - 'a';
            if (trie.get(node)[i] > 0) {
                total += dfs(trie.get(node)[i], hasFirst || (letter == puzzle.charAt(0)), puzzle, trie, cnt);
            }
        }
        return total;
    }
}