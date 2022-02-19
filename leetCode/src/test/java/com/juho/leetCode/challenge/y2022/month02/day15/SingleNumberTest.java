package com.juho.leetCode.challenge.y2022.month02.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    SingleNumber sn = new SingleNumber();

    @Test
    public void singleNumber01Test() {
        int[] nums01 = {2,2,1};
        assertEquals(1, sn.singleNumber(nums01));

        int[] nums02 = {4,1,2,1,2};
        assertEquals(4, sn.singleNumber(nums02));
    }
}