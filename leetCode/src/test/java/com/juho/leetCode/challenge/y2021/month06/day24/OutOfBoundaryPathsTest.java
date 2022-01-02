package com.juho.leetCode.challenge.y2021.month06.day24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OutOfBoundaryPathsTest {

    OutOfBoundaryPaths obp = new OutOfBoundaryPaths();

    @Test
    public void outOfBoundaryPaths01Test() {
        assertEquals(6, obp.findPaths(2, 2, 2, 0, 0));
        assertEquals(12, obp.findPaths(1, 3, 3, 0, 1));
    }

}
