package com.juho.leetCode.challenge.month06.day12;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumNumberOfRefuelingStops {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0, prev = 0;
        for (int[] station: stations) {
            int location = station[0];
            int capacity = station[1];
            startFuel -= location - prev;
            while (!pq.isEmpty() && startFuel < 0) {  // must refuel in past
                startFuel += pq.poll();
                ans++;
            }

            if (startFuel < 0) return -1;
            pq.offer(capacity);
            prev = location;
        }

        startFuel -= target - prev;
        while (!pq.isEmpty() && startFuel < 0) {
            startFuel += pq.poll();
            ans++;
        }
        if (startFuel < 0) return -1;

        return ans;
    }
}