package com.juho.leetCode.challenge.y2021.month01.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PathWithMinimumEffortTest {

    PathWithMinimumEffort pwme = new PathWithMinimumEffort();

    @Test
    public void pathWithMinimumEffort01Test() {
        int[][] heights01 = {{1,2,2},{3,8,2},{5,3,5}};
        assertEquals(pwme.minimumEffortPath(heights01), 2);
    }
}