package com.juho.leetCode.challenge.month11.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UniqueBinarySearchTreesTest {

    UniqueBinarySearchTrees ubst = new UniqueBinarySearchTrees();

    @Test
    public void uniqueBinarySearchTrees01Test() {
        int n01 = 3;
        assertEquals(5, ubst.numTrees(n01));

        int n02 = 1;
        assertEquals(1, ubst.numTrees(n02));
    }
}