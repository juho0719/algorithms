package com.juho.leetCode.challenge.y2022.month01.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ComplementOfBase10IntegerTest {

    ComplementOfBase10Integer cbi = new ComplementOfBase10Integer();
    
    @Test
    public void complementOfBase10Integer01Test() {
        int n01 = 5;
        assertEquals(2, cbi.bitwiseComplement(n01));

        int n02 = 7;
        assertEquals(0, cbi.bitwiseComplement(n02));

        int n03 = 10;
        assertEquals(5, cbi.bitwiseComplement(n03));
    }
}