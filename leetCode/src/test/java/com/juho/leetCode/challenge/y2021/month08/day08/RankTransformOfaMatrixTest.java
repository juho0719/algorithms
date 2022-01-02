package com.juho.leetCode.challenge.y2021.month08.day08;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class RankTransformOfaMatrixTest {

    RankTransformOfaMatrix rtm = new RankTransformOfaMatrix();

    @Test
    public void rankTransformOfaMatrix01Test() {
        int[][] matrix01 = {{1,2},{3,4}};
        int[][] result01 = {{1,2},{2,3}};
        assertArrayEquals(result01, rtm.matrixRankTransform(matrix01));

        int[][] matrix02 = {{7,7},{7,7}};
        int[][] result02 = {{1,1},{1,1}};
        assertArrayEquals(result02, rtm.matrixRankTransform(matrix02));

        int[][] matrix04 = {{20,-21,14},{-19,4,19},{22,-47,24},{-19,4,19}};
        int[][] result04 = {{4,2,3},{1,3,4},{5,1,6},{1,3,4}};
        assertArrayEquals(result04, rtm.matrixRankTransform(matrix04));
    }
}
