package com.juho.leetCode.decemberLeetCodingChallenge.day03;

public class BeautifulArrangement {

    public int countArrangement(int n) {
        boolean[] visited = new boolean[n];
        AtomicInteger cnt = new AtomicInteger();
        permutation(visited, 0, n, cnt);

        return cnt.get();
    }

    private void permutation(boolean[] visited, int depth, int n, AtomicInteger cnt) {
        if (depth == n) {
            cnt.incrementAndGet();
            return;
        }

        for (int i=0; i<n; i++) {
            if(!visited[i] && ((i+1) % (depth+1) == 0 || (depth+1) % (i+1) == 0)) {
                visited[i] = true;
                permutation(visited, depth + 1, n, cnt);
                visited[i] = false;
            }
        }
    }
}