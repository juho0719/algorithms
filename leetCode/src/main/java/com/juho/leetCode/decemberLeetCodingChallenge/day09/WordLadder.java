package com.juho.leetCode.decemberLeetCodingChallenge.day09;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int result = 0;
        if(!wordList.contains(endWord)) return 0;

        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);

        Queue<String> wordQueue = new LinkedList<>();
        wordQueue.add(beginWord);
        while(!wordQueue.isEmpty()) {
            int size = wordQueue.size();
            result++;
            while(size-- > 0) {
                String word = wordQueue.remove();
                if(word.equals(endWord)) {
                    return result;
                }
                for(int i=0; i<word.length(); i++) {
                    for(char c = 'a'; c <= 'z'; c++) {
                        String newWord = word.substring(0, i) + c + word.substring(i+1);
                        if(wordSet.contains(newWord)) {
                            wordQueue.add(newWord);
                            wordSet.remove(newWord);
                        }
                    }
                }

            }
        }
        return 0;
    }
}