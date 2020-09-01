package com.juho.leetCode.slidingWindowMaximum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {

	SlidingWindowMaximum swm = new SlidingWindowMaximum();

	@Test
	public void testBruteForceMax() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int[] nums2 = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int[] nums3 = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };

		int k = 3;
		int k2 = 3;
		int k3 = 4;

		int[] result = { 3, 3, 5, 5, 6, 7 };
		int[] result2 = { 3, 3, 4, 5, 5, 5, 6 };
		int[] result3 = { 10, 10, 10, 15, 15, 90, 90 };

		assertThat(result).containsOnly(swm.bruteForceMax(nums, k));
		assertThat(result2).containsOnly(swm.bruteForceMax(nums2, k2));
		assertThat(result3).containsOnly(swm.bruteForceMax(nums3, k3));
		// assertEquals(result, swm.bruteForceMax(nums, k));
	}

	@Test
	public void testDequeMax() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int[] nums2 = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int[] nums3 = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };

		int k = 3;
		int k2 = 3;
		int k3 = 4;

		int[] result = { 3, 3, 5, 5, 6, 7 };
		int[] result2 = { 3, 3, 4, 5, 5, 5, 6 };
		int[] result3 = { 10, 10, 10, 15, 15, 90, 90 };

		assertThat(result).containsOnly(swm.dequeMax(nums, k));
		assertThat(result2).containsOnly(swm.dequeMax(nums2, k2));
		assertThat(result3).containsOnly(swm.dequeMax(nums3, k3));
	}
}