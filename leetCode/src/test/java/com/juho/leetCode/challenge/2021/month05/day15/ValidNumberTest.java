package com.juho.leetCode.challenge.month05.day15;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidNumberTest {

    ValidNumber vn = new ValidNumber();
    
    @Test
    public void validNumber01Test() {
        assertEquals(true, vn.isNumber("0"));
        assertEquals(false, vn.isNumber("e"));
        assertEquals(false, vn.isNumber("."));
        assertEquals(true, vn.isNumber(".1"));
    }
}