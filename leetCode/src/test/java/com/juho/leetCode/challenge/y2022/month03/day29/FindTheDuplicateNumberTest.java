package com.juho.leetCode.challenge.y2022.month03.day29;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateNumberTest {

    FindTheDuplicateNumber fdn = new FindTheDuplicateNumber();

    @Test
    public void findTheDuplicateNumber01Test() {
        int[] nums01 = {1,3,4,2,2};
        assertEquals(2, fdn.findDuplicate(nums01));

        int[] nums02 = {3,1,3,4,2};
        assertEquals(3, fdn.findDuplicate(nums02));
    }
}