package com.juho.leetCode.challenge.month10.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ThreeSumTest {

    ThreeSum ts = new ThreeSum();

    @Test
    public void threeSum01Test() {
        int[] nums01 = {-1,0,1,2,-1,-4};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(-1);
        result101.add(-1);
        result101.add(2);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(-1);
        result102.add(0);
        result102.add(1);
        result100.add(result102);
        assertEquals(result100, ts.threeSum(nums01));
    }
}