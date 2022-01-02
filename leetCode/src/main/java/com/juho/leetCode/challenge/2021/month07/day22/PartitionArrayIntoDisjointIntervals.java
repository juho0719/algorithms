package com.juho.leetCode.challenge.month07.day22;

public class PartitionArrayIntoDisjointIntervals {

    public int partitionDisjoint(int[] nums) {
        int N = nums.length;
        int[] maxleft = new int[N];
        int[] minright = new int[N];

        int m = nums[0];
        for (int i = 0; i < N; ++i) {
            m = Math.max(m, nums[i]);
            maxleft[i] = m;
        }

        m = nums[N-1];
        for (int i = N-1; i >= 0; --i) {
            m = Math.min(m, nums[i]);
            minright[i] = m;
        }

        for (int i = 1; i < N; ++i)
            if (maxleft[i-1] <= minright[i])
                return i;

        throw null;
    }
       
}