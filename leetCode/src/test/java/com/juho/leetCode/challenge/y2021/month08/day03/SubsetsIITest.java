package com.juho.leetCode.challenge.y2021.month08.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SubsetsIITest {

    SubsetsII ss2 = new SubsetsII();

    @Test
    public void subsetsII01Test() {
        int[] nums01 = {1,2,2};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(1);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(1);
        result103.add(2);
        result100.add(result103);
        List<Integer> result104 = new ArrayList<>();
        result104.add(1);
        result104.add(2);
        result104.add(2);
        result100.add(result104);
        List<Integer> result105 = new ArrayList<>();
        result105.add(2);
        result100.add(result105);
        List<Integer> result106 = new ArrayList<>();
        result106.add(2);
        result106.add(2);
        result100.add(result106);
        assertEquals(result100, ss2.subsetsWithDup(nums01));
    }
}
