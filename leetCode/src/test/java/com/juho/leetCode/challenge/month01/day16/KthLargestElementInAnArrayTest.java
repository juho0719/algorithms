package com.juho.leetCode.challenge.month01.day16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KthLargestElementInAnArrayTest {

    KthLargestElementInAnArray kleia = new KthLargestElementInAnArray();

    @Test
    public void kthLargestElementInAnArray01Test() {
        int[] nums01 = {3,2,1,5,6,4};
        int k01 = 2;
        assertEquals(kleia.findKthLargest(nums01, k01), 5);

        int[] nums02 = {3,2,3,1,2,4,5,5,6};
        int k02 = 4;
        assertEquals(kleia.findKthLargest(nums02, k02), 4);
    }
}