package com.juho.leetCode.challenge.y2021.month12.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    HouseRobber hr = new HouseRobber();

    @Test
    public void houseRobber01Test() {
        int[] nums01 = {1,2,3,1};
        assertEquals(4, hr.rob(nums01));

        int[] nums02 = {2,7,9,3,1};
        assertEquals(12, hr.rob(nums02));
    }
}