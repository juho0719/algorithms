package com.juho.leetCode.challenge.month07.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class GrayCodeTest {

    GrayCode gc = new GrayCode();

    @Test
    public void grayCode01Test() {
        int n01 = 2;
        List<Integer> result01 = new ArrayList<>();
        result01.add(0);
        result01.add(1);
        result01.add(3);
        result01.add(2);
        assertEquals(result01.toString(), gc.grayCode(n01).toString());
    }

}
