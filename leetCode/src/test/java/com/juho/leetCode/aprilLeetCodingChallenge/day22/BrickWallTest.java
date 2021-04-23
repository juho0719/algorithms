package com.juho.leetCode.aprilLeetCodingChallenge.day22;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BrickWallTest {

    BrickWall bw = new BrickWall();

    @Test
    public void brickWall01Test() {
        List<List<Integer>> root101 = new ArrayList<>(); 
        List<Integer> node101 = new ArrayList<>();
        node101.add(1);
        node101.add(2);
        node101.add(2);
        node101.add(1);
        root101.add(node101);

        List<Integer> node102 = new ArrayList<>();
        node102.add(3);
        node102.add(1);
        node102.add(2);
        root101.add(node102);

        List<Integer> node103 = new ArrayList<>();
        node103.add(1);
        node103.add(3);
        node103.add(2);
        root101.add(node103);

        List<Integer> node104 = new ArrayList<>();
        node104.add(2);
        node104.add(4);
        root101.add(node104);

        List<Integer> node105 = new ArrayList<>();
        node105.add(3);
        node105.add(1);
        node105.add(2);
        root101.add(node105);

        List<Integer> node106 = new ArrayList<>();
        node106.add(1);
        node106.add(3);
        node106.add(1);
        node106.add(1);
        root101.add(node106);

        assertEquals(2, bw.leastBricks(root101));
    }
}
