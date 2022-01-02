package com.juho.leetCode.challenge.y2021.month06.day13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PalindromePairsTest {

    PalindromePairs pp = new PalindromePairs();

    @Test
    public void palindromePairs01Test() {
        String[] words01 = {"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> result100 = new ArrayList<>();
        List<Integer> result101 = new ArrayList<>();
        result101.add(0);
        result101.add(1);
        result100.add(result101);
        List<Integer> result102 = new ArrayList<>();
        result102.add(1);
        result102.add(0);
        result100.add(result102);
        List<Integer> result103 = new ArrayList<>();
        result103.add(3);
        result103.add(2);
        result100.add(result103);
        List<Integer> result104 = new ArrayList<>();
        result104.add(2);
        result104.add(4);
        result100.add(result104);
        assertEquals(result100, pp.palindromePairs(words01));

        String[] words02 = {"bat", "tab", "cat"};
        List<List<Integer>> result200 = new ArrayList<>();
        List<Integer> result201 = new ArrayList<>();
        result201.add(0);
        result201.add(1);
        result200.add(result201);
        List<Integer> result202 = new ArrayList<>();
        result202.add(1);
        result202.add(0);
        result200.add(result202);
        assertEquals(result200, pp.palindromePairs(words02));
    }

}
