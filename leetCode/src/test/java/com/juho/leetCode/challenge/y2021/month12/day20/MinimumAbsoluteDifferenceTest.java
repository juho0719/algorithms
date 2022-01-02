package com.juho.leetCode.challenge.y2021.month12.day20;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MinimumAbsoluteDifferenceTest {

    MinimumAbsoluteDifference mad = new MinimumAbsoluteDifference();

    @Test
    public void minimumAbsoluteDifference01Test() {
        int[] arr01 = {4,2,1,3};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(1);
        result101.add(2);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(2);
        result102.add(3);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(3);
        result103.add(4);
        result100.add(result103);
        assertEquals(result100, mad.minimumAbsDifference(arr01));

        int[] arr02 = {1,3,6,10,15};
        List<List<Integer>> result200 = new ArrayList<>();
        List<Integer> result201 = new ArrayList<>();
        result201.add(1);
        result201.add(3);
        result200.add(result201);
        assertEquals(result200, mad.minimumAbsDifference(arr02));
    }
}