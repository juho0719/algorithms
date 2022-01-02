package com.juho.leetCode.challenge.y2021.month01.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConcatenationOfConsecutiveBinaryNumbersTest {

    ConcatenationOfConsecutiveBinaryNumbers cocbn = new ConcatenationOfConsecutiveBinaryNumbers();

    @Test
    public void concatenationOfConsecutiveBinaryNumbers01Test() {
        int n01 = 1;
        assertEquals(cocbn.concatenatedBinary(n01), 1);

        int n02 = 3;
        assertEquals(cocbn.concatenatedBinary(n02), 27);

        int n03 = 12;
        assertEquals(cocbn.concatenatedBinary(n03), 505379714);
    }
}