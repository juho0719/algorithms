package com.juho.leetCode.challenge.y2021.month06.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PascalsTriangleTest {

    PascalsTriangle pt = new PascalsTriangle();

    @Test
    public void pascalsTriangle01Test() {
        int numRows01 = 5;
        List<List<Integer>> expected01 = new ArrayList<>();
        List<Integer> expected0101 = new ArrayList<>();
        expected0101.add(1);
        expected01.add(expected0101);
        List<Integer> expected0102 = new ArrayList<>();
        expected0102.add(1);
        expected0102.add(1);
        expected01.add(expected0102);
        List<Integer> expected0103 = new ArrayList<>();
        expected0103.add(1);
        expected0103.add(2);
        expected0103.add(1);
        expected01.add(expected0103);
        List<Integer> expected0104 = new ArrayList<>();
        expected0104.add(1);
        expected0104.add(3);
        expected0104.add(3);
        expected0104.add(1);
        expected01.add(expected0104);
        List<Integer> expected0105 = new ArrayList<>();
        expected0105.add(1);
        expected0105.add(4);
        expected0105.add(6);
        expected0105.add(4);
        expected0105.add(1);
        expected01.add(expected0105);

        assertEquals(expected01, pt.generate(numRows01));
    }

}
