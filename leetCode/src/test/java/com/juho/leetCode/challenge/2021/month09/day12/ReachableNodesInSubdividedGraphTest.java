package com.juho.leetCode.challenge.month09.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReachableNodesInSubdividedGraphTest {

    ReachableNodesInSubdividedGraph rnsg = new ReachableNodesInSubdividedGraph();

    @Test
    public void reachableNodesInSubdividedGraph01Test() {
        int[][] edges01 = {{0,1,10},{0,2,1},{1,2,2}};
        int maxMoves01 = 6;
        int n01 = 3;
        assertEquals(13, rnsg.reachableNodes(edges01, maxMoves01, n01));

        int[][] edges02 = {{0,1,4},{1,2,6},{0,2,8},{1,3,1}};
        int maxMoves02 = 10;
        int n02 = 4;
        assertEquals(23, rnsg.reachableNodes(edges02, maxMoves02, n02));
    }
}