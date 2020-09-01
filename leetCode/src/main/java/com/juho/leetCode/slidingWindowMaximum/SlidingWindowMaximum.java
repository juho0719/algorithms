package com.juho.leetCode.slidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
	public int[] bruteForceMax(int[] nums, int k) {
		int numOfWindows = nums.length - k + 1;
		int[] result = new int[numOfWindows];
		int max = -10 ^ 4;

		for (int i = 0; i < numOfWindows; i++) {
			for (int j = i; j < k + i - 1; j++) {
				if (j == i)
					max = nums[j];
				if (max < nums[j + 1]) {
					max = nums[j + 1];
				}
			}
			result[i] = max;
		}

		return result;
	}

	public int[] dequeMax(int[] nums, int k) {
		int numOfWindows = nums.length - k + 1;
		int[] result = new int[numOfWindows];

		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 0; i < nums.length; i++) {
			if (i >= k && deque.peekFirst() == i - k) {
				deque.pollFirst();
			}

			deque.offerLast(nums[i]);
		}

		return result;
	}
}