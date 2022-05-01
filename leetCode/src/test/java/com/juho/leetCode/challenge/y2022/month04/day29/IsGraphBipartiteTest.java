package com.juho.leetCode.challenge.y2022.month04.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class IsGraphBipartiteTest {

    IsGraphBipartite igb = new IsGraphBipartite();

    @Test
    public void isGraphBipartite01Test() {
        int[][] graph01 = {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertEquals(false, igb.isBipartite(graph01));
    }
}