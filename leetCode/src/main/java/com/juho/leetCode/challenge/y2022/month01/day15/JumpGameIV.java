package com.juho.leetCode.challenge.y2022.month01.day15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 * In one step you can jump from index i to index:
 * - i + 1 where: i + 1 < arr.length.
 * - i - 1 where: i - 1 >= 0.
 * - j where: arr[i] == arr[j] and i != j.
 * Return the minimum number of steps to reach the last index of the array.
 * Notice that you can not jump outside of the array at any time.
 * 
 * Example 1:
 * Input: arr = [100,-23,-23,404,100,23,23,23,3,404]
 * Output: 3
 * Explanation: You need three jumps from index 0 --> 4 --> 3 --> 9. Note that index 9 is the last index of the array.
 * 
 * Example 2:
 * Input: arr = [7]
 * Output: 0
 * Explanation: Start index is the last index. You do not need to jump.
 * 
 * Example 3:
 * Input: arr = [7,6,9,6,9,6,9,7]
 * Output: 1
 * Explanation: You can jump directly from index 0 to index 7 which is last index of the array.
 * 
 * Constraints:
 * 1 <= arr.length <= 5 * 10^4
 * -10^8 <= arr[i] <= 10^8
 */

public class JumpGameIV {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return 0;
        }
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }
        List<Integer> curs = new LinkedList<>();
        curs.add(0);
        Set<Integer> visited = new HashSet<>();
        int step = 0;

        while (!curs.isEmpty()) {
            List<Integer> nex = new LinkedList<>();
            for (int node : curs) {
                if (node == n - 1) {
                    return step;
                }
                for (int child : graph.get(arr[node])) {
                    if (!visited.contains(child)) {
                        visited.add(child);
                        nex.add(child);
                    }
                }
                graph.get(arr[node]).clear();
                if (node + 1 < n && !visited.contains(node + 1)) {
                    visited.add(node + 1);
                    nex.add(node + 1);
                }
                if (node - 1 >= 0 && !visited.contains(node - 1)) {
                    visited.add(node - 1);
                    nex.add(node - 1);
                }
            }
            curs = nex;
            step++;
        }
        return -1;
    }
}