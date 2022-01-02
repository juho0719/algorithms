package com.juho.leetCode.challenge.y2021.month07.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidTriangleNumberTest {

    ValidTriangleNumber vtn = new ValidTriangleNumber();

    @Test
    public void validTriangleNumber01Test() {
        int[] nums01 = {2,2,3,4};
        assertEquals(3, vtn.triangleNumber(nums01));

        int[] nums02 = {4,2,3,4};
        assertEquals(4, vtn.triangleNumber(nums02));
    }

}
