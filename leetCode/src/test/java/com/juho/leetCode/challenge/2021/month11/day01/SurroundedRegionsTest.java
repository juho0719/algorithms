package com.juho.leetCode.challenge.month11.day01;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SurroundedRegionsTest {

    SurroundedRegions sr = new  SurroundedRegions();

    @Test
    public void surroundedRegions01Test() {
        char[][] board01 = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] result01 = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};
        sr.solve(board01);
        assertArrayEquals(result01, board01);
    }
}