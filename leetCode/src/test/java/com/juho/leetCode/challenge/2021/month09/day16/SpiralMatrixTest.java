package com.juho.leetCode.challenge.month09.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpiralMatrixTest {

    SpiralMatrix sm = new SpiralMatrix();

    @Test
    public void spiralMatrix01Test() {
        int[][] matrix01 = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result01 = new ArrayList<>();
        result01.add(1);
        result01.add(2);
        result01.add(3);
        result01.add(6);
        result01.add(9);
        result01.add(8);
        result01.add(7);
        result01.add(4);
        result01.add(5);
        assertEquals(result01.toString(), sm.spiralOrder(matrix01).toString());
    }
}