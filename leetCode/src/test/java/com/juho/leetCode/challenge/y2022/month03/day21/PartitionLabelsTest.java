package com.juho.leetCode.challenge.y2022.month03.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PartitionLabelsTest {

    PartitionLabels pl = new PartitionLabels();

    @Test
    public void partitionLabels01Test() {
        String s01 = "ababcbacadefegdehijhklij";
        List<Integer> result01 = new ArrayList<>();
        result01.add(9);
        result01.add(7);
        result01.add(8);
        assertEquals(result01, pl.partitionLabels(s01));
    }
}