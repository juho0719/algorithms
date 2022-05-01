package com.juho.leetCode.challenge.y2022.month04.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SmallestStringWithSwapsTest {

    SmallestStringWithSwaps sss = new SmallestStringWithSwaps();

    @Test
    public void smallestStringWithSwaps01Test() {
        String s01 = "dcab";
        List<List<Integer>> pairs100 = new ArrayList<>();
        List<Integer> pairs101 = new ArrayList<>();
        pairs101.add(0);
        pairs101.add(3);
        pairs100.add(pairs101);
        List<Integer> pairs102 = new ArrayList<>();
        pairs102.add(1);
        pairs102.add(2);
        pairs100.add(pairs102);
        assertEquals("bacd", sss.smallestStringWithSwaps(s01, pairs100));
    }
}