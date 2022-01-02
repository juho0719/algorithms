package com.juho.leetCode.challenge.month11.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedInAnArrayTest {

    FindAllNumbersDisappearedInAnArray fanda = new FindAllNumbersDisappearedInAnArray();

    @Test
    public void findAllNumbersDisappearedInAnArray01Test() {
        int[] nums01 = {4,3,2,7,8,2,3,1};
        List<Integer> result01 = new ArrayList<>();
        result01.add(5);
        result01.add(6);
        assertEquals(result01.toString(), fanda.findDisappearedNumbers(nums01).toString());

        int[] nums02 = {1,1};
        List<Integer> result02 = new ArrayList<>();
        result02.add(2);
        assertEquals(result02.toString(), fanda.findDisappearedNumbers(nums02).toString());
    }
}