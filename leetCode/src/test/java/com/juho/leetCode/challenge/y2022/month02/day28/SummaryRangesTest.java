package com.juho.leetCode.challenge.y2022.month02.day28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SummaryRangesTest {

    SummaryRanges sr = new SummaryRanges();

    @Test
    public void summaryRanges01Test() {
        int[] nums01 = {0,1,2,4,5,7};
        List<String> result01 = new ArrayList<>();
        result01.add("0->2");
        result01.add("4->5");
        result01.add("7");
        assertEquals(result01, sr.summaryRanges(nums01));
    }
}