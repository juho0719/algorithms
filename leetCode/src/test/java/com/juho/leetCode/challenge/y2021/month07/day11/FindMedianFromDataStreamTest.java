package com.juho.leetCode.challenge.y2021.month07.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindMedianFromDataStreamTest {

    @Test
    public void findMedianFromDataStream01Test() {
        FindMedianFromDataStream fmds = new FindMedianFromDataStream();

        fmds.addNum(1);
        fmds.addNum(2);
        assertEquals(1.5, fmds.findMedian());

        fmds.addNum(3);
        assertEquals(2.0, fmds.findMedian());
    }

}
