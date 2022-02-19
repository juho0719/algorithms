package com.juho.leetCode.challenge.y2022.month02.day17;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CombinationSumTest {

    CombinationSum cs = new CombinationSum();

    @Test
    public void combinationSum01Test() {
        int[] candidates01 = {2,3,6,7};
        int target01 = 7;

        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(2);
        result101.add(2);
        result101.add(3);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(7);
        result100.add(result102);

        assertEquals(result100, cs.combinationSum(candidates01, target01));
    }
}