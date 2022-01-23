package com.juho.leetCode.challenge.y2022.month01.day23;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SequentialDigitsTest {
    
    SequentialDigits sd = new SequentialDigits();

    @Test
    public void sequentialDigits01Test() {
        int low01 = 100;
        int high01 = 300;
        List<Integer> result01 = new ArrayList<>();
        result01.add(123);
        result01.add(234);
        assertEquals(result01, sd.sequentialDigits(low01, high01));

        int low02 = 1000;
        int high02 = 13000;
        List<Integer> result02 = new ArrayList<>();
        result02.add(1234);
        result02.add(2345);
        result02.add(3456);
        result02.add(4567);
        result02.add(5678);
        result02.add(6789);
        result02.add(12345);
        assertEquals(result02, sd.sequentialDigits(low02, high02));
    }
}