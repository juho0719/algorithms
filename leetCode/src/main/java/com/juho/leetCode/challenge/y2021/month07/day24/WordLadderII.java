package com.juho.leetCode.challenge.y2021.month07.day24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadderII {
    Map<String, List<String>> adjList = new HashMap<>();
    List<String> currPath = new ArrayList<>();
    List<List<String>> shortestPaths = new ArrayList<>();
    
    private List<String> findNeighbors(String word, Set<String> wordList) {
        List<String> neighbors = new ArrayList<>();
        char charList[] = word.toCharArray();
        
        for (int i = 0; i < word.length(); i++) {
            char oldChar = charList[i];   
            for (char c = 'a'; c <= 'z'; c++) {
                charList[i] = c;
                if (c == oldChar || !wordList.contains(String.valueOf(charList))) {
                    continue;
                }
                neighbors.add(String.valueOf(charList));
            }
            charList[i] = oldChar;
        }
        return neighbors;
    }
    
    private void backtrack(String source, String destination) {
        if (source.equals(destination)) {
            List<String> tempPath = new ArrayList<>(currPath);
            shortestPaths.add(tempPath);
        }
        
        if (!adjList.containsKey(source)) return;
        for (int i = 0; i < adjList.get(source).size(); i++) {
            currPath.add(adjList.get(source).get(i));
            backtrack(adjList.get(source).get(i), destination);
            currPath.remove(currPath.size() - 1);
        }
    }
    
    private void addEdge(String word1, String word2, int direction) {
        if(direction == 1) {
            if (!adjList.containsKey(word1)) {
                adjList.put(word1, new ArrayList<String>());
            }
            adjList.get(word1).add(word2);
        } else {
            if (!adjList.containsKey(word2)) {
                adjList.put(word2, new ArrayList<String>());
            }
            adjList.get(word2).add(word1);
        }
    }
    
    private boolean bfs(String beginWord, String endWord, Set<String> wordList) {
        if (wordList.contains(endWord) == false) {
            return false;
        }
        if (wordList.contains(beginWord)) {
            wordList.remove(beginWord);
        }

        Set<String> forwardQueue =  new HashSet<>();
        Set<String> backwardQueue = new HashSet<>();
        
        forwardQueue.add(beginWord);
        backwardQueue.add(endWord);
        
        boolean found = false;
        int direction = 1;
        
        while (forwardQueue.isEmpty() != true)  {
            Set<String> visited = new HashSet<>();
            if (forwardQueue.size() > backwardQueue.size()) {
                Set<String> temp = forwardQueue;
                 forwardQueue = backwardQueue;
                 backwardQueue = temp;
                 direction ^= 1;
            }
            
            for (String currWord : forwardQueue) {
                List<String> neighbors = findNeighbors(currWord, wordList);
                for (String word : neighbors) {
                    if (backwardQueue.contains(word)) {
                        found = true;
                        addEdge(currWord, word, direction);
                    } else if (!found && wordList.contains(word) == true && forwardQueue.contains(word) == false) {
                        visited.add(word);
                        addEdge(currWord, word, direction);
                    }
                }
            }
            
            for (String currWord : forwardQueue) {
                if (wordList.contains(currWord)) {
                    wordList.remove(currWord);
                }
            }
            if (found) break;
            forwardQueue = visited;
        }
        return found;
    }
    
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> copiedWordList = new HashSet<>(wordList);
        boolean sequence_found = bfs(beginWord, endWord, copiedWordList);
        
        if (sequence_found == false) {
            return shortestPaths;
        }
        currPath.add(beginWord);
        backtrack(beginWord, endWord);
        
        return shortestPaths;
    }            
}