package com.juho.leetCode.challenge.y2022.month02.day21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    MajorityElement me = new MajorityElement();

    @Test
    public void majorityElement01Test() {
        int[] nums01 = {3,2,3};
        assertEquals(3, me.majorityElement(nums01));
        
        int[] nums02 = {2,2,1,1,1,2,2};
        assertEquals(2, me.majorityElement(nums02));
    }
}