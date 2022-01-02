package com.juho.leetCode.challenge.y2021.month10.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SortCharactersByFrequencyTest {

    SortCharactersByFrequency scf = new SortCharactersByFrequency();

    @Test
    public void sortCharactersByFrequency01Test() {
        String s01 = "tree";
        assertEquals("eert", scf.frequencySort(s01));

        String s02 = "cccaaa";
        assertEquals("aaaccc", scf.frequencySort(s02));

        String s03 = "Aabb";
        assertEquals("bbAa", scf.frequencySort(s03));
    }
}