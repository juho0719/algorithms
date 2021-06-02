package com.juho.leetCode.challenge.month02.day14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsGraphBipartiteTest {
    
    IsGraphBipartite igb = new IsGraphBipartite();

    @Test
    public void isGraphBipartite01Test() {
        // bfs
        int[][] bfsGraph01 = new int[][]{{1,2,3}, {0,2}, {0,1,3}, {0,2}};
        assertEquals(igb.isBipartiteByBFS(bfsGraph01), false);
        int[][] bfsGraph02 = new int[][]{{1,3}, {0,2}, {1,3}, {0,2}};
        assertEquals(igb.isBipartiteByBFS(bfsGraph02), true);

        // dfs
        int[][] dfsGraph01 = new int[][]{{1,2,3}, {0,2}, {0,1,3}, {0,2}};
        assertEquals(igb.isBipartiteByDFS(dfsGraph01), false);
        int[][] dfsGraph02 = new int[][]{{1,3}, {0,2}, {1,3}, {0,2}};
        assertEquals(igb.isBipartiteByDFS(dfsGraph02), true);
    }
}
