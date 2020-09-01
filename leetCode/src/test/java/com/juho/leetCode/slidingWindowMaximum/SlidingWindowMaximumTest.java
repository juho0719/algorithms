package com.juho.leetCode.slidingWindowMaximum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SlidingWindowMaximumTest {

	SlidingWindowMaximum swm = new SlidingWindowMaximum();

	@Test
	public void testBruteForceMax() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = { 3, 3, 5, 5, 6, 7 };

		assertEquals(result, swm.bruteForceMax(nums, k));
	}

	@Test
	public void testDequeMax() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = { 3, 3, 5, 5, 6, 7 };

		assertEquals(result, swm.bruteForceMax(nums, k));
	}
}