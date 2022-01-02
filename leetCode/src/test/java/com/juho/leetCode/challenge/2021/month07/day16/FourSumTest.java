package com.juho.leetCode.challenge.month07.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FourSumTest {

    FourSum fs = new FourSum();

    @Test
    public void fourSum01Test() {
        int[] nums01 = {1,0,-1,0,-2,2};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(-2);
        result101.add(-1);
        result101.add(1);
        result101.add(2);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(-2);
        result102.add(0);
        result102.add(0);
        result102.add(2);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(-1);
        result103.add(0);
        result103.add(0);
        result103.add(1);
        result100.add(result103);

        assertEquals(result100, fs.fourSum(nums01, 0));
    }

}
