package com.juho.leetCode.challenge.y2021.month11.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class AllPathsFromSourceToTargetTest {

    AllPathsFromSourceToTarget apst = new AllPathsFromSourceToTarget();

    @Test
    public void allPathsFromSourceToTarget01Test() {
        int[][] graph01 = {{1,2},{3},{3},{}};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(0);
        result101.add(1);
        result101.add(3);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(0);
        result102.add(2);
        result102.add(3);
        result100.add(result102);
        assertEquals(result100, apst.allPathsSourceTarget(graph01));

    }
}