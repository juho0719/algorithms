package com.juho.leetCode.challenge.month07.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindKClosestElementsTest {

    FindKClosestElements fce = new FindKClosestElements();

    @Test
    public void findKClosestElements01Test() {
        int[] arr01 = {1,2,3,4,5};
        int k01 = 4;
        int x01 = 3;
        List<Integer> result01 = new ArrayList<>();
        result01.add(1);
        result01.add(2);
        result01.add(3);
        result01.add(4);
        assertEquals(result01.toString(), fce.findClosestElements(arr01, k01, x01).toString());

        int[] arr02 = {1,2,3,4,5};
        int k02 = 4;
        int x02 = -1;
        List<Integer> result02 = new ArrayList<>();
        result02.add(1);
        result02.add(2);
        result02.add(3);
        result02.add(4);
        assertEquals(result02.toString(), fce.findClosestElements(arr02, k02, x02).toString());
    }

}
