package com.juho.leetCode.challenge.y2022.month03.day05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DeleteAndEarnTest {

    DeleteAndEarn de = new DeleteAndEarn();

    @Test
    public void deleteAndEarn01Test() {
        int[] nums01 = {3,4,2};
        assertEquals(6, de.deleteAndEarn(nums01));

        int[] nums02 = {2,2,3,3,3,4};
        assertEquals(9, de.deleteAndEarn(nums02));
    }
}