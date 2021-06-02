package com.juho.leetCode.challenge.month05.day26;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    
    PartitioningIntoMinimumNumberOfDeciBinaryNumbers pmndbn = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void partitioningIntoMinimumNumberOfDeciBinaryNumbers01Test() {
        String n01 = "32";
        assertEquals(3, pmndbn.minPartitions(n01));

        String n02 = "82734";
        assertEquals(8, pmndbn.minPartitions(n02));

        String n03 = "27346209830709182346";
        assertEquals(9, pmndbn.minPartitions(n03));
    }
}