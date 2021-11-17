package com.juho.leetCode.challenge.month11.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UniquePathsTest {

    UniquePaths up = new UniquePaths();

    @Test
    public void kthSmallestNumberInMultiplicationTable01Test() {
        int m01 = 3;
        int n01 = 7;
        assertEquals(28, up.uniquePaths(m01, n01));

        int m02 = 3;
        int n02 = 2;
        assertEquals(3, up.uniquePaths(m02, n02));

        int m03 = 7;
        int n03 = 3;
        assertEquals(28, up.uniquePaths(m03, n03));

        int m04 = 3;
        int n04 = 3;
        assertEquals(6, up.uniquePaths(m04, n04));
    }
}