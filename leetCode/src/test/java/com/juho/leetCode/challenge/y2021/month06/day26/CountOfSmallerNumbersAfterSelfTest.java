package com.juho.leetCode.challenge.y2021.month06.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CountOfSmallerNumbersAfterSelfTest {

    CountOfSmallerNumbersAfterSelf csnas = new CountOfSmallerNumbersAfterSelf();

    @Test
    public void countOfSmallerNumbersAfterSelf01Test() {
        int[] nums01 = {5,2,6,1};
        List<Integer> result01 = new ArrayList<>();
        result01.add(2);
        result01.add(1);
        result01.add(1);
        result01.add(0);
        assertEquals(result01, csnas.countSmaller(nums01));

        int[] nums02 = {-1};
        List<Integer> result02 = new ArrayList<>();
        result02.add(0);
        assertEquals(result02, csnas.countSmaller(nums02));

        int[] nums03 = {-1,-1};
        List<Integer> result03 = new ArrayList<>();
        result03.add(0);
        result03.add(0);
        assertEquals(result03, csnas.countSmaller(nums03));
    }

}
