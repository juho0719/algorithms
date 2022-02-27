package com.juho.leetCode.challenge.y2022.month02.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShortestPathVisitingAllNodesTest {

    ShortestPathVisitingAllNodes spvn = new ShortestPathVisitingAllNodes();

    @Test
    public void shortestPathVisitingAllNodes01Test() {
        int[][] graph01 = {{1,2,3},{0},{0},{0}};
        assertEquals(4, spvn.shortestPathLength(graph01));
    }
}