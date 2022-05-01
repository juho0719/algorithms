package com.juho.leetCode.challenge.y2022.month04.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PathWithMinimumEffortTest {

    PathWithMinimumEffort pme = new PathWithMinimumEffort();

    @Test
    public void pathWithMinimumEffort01Test() {
        int[][] heights01 = {{1,2,2},{3,8,2},{5,3,5}};
        assertEquals(2, pme.minimumEffortPath(heights01));
    }
}