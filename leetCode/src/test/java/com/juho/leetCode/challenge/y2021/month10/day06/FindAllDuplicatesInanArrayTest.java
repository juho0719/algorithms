package com.juho.leetCode.challenge.y2021.month10.day06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindAllDuplicatesInanArrayTest {

    FindAllDuplicatesInanArray fada = new FindAllDuplicatesInanArray();

    @Test
    public void findAllDuplicatesInanArray01Test() {
        int[] nums01 = {4,3,2,7,8,2,3,1};
        List<Integer> result01 = new ArrayList<>();
        result01.add(2);
        result01.add(3);
        assertEquals(result01, fada.findDuplicates(nums01));

        int[] nums02 = {1,1,2};
        List<Integer> result02 = new ArrayList<>();
        result02.add(1);
        assertEquals(result02, fada.findDuplicates(nums02));
    }
}