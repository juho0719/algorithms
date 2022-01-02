package com.juho.leetCode.challenge.y2021.month11.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class NumberOfValidWordsForEachPuzzleTest {

    NumberOfValidWordsForEachPuzzle nvwep = new NumberOfValidWordsForEachPuzzle();

    @Test
    public void numberOfValidWordsForEachPuzzle01Test() {
        String[] words01 = {"aaaa","asas","able","ability","actt","actor","access"};
        String[] puzzles01 = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        List<Integer> result01 = new ArrayList<>();
        result01.add(1);
        result01.add(1);
        result01.add(3);
        result01.add(2);
        result01.add(4);
        result01.add(0);
        assertEquals(result01, nvwep.findNumOfValidWords(words01, puzzles01));

        String[] words02 = {"apple","pleas","please"};
        String[] puzzles02 = {"aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"};
        List<Integer> result02 = new ArrayList<>();
        result02.add(0);
        result02.add(1);
        result02.add(3);
        result02.add(2);
        result02.add(0);
        assertEquals(result02, nvwep.findNumOfValidWords(words02, puzzles02));
    }
}