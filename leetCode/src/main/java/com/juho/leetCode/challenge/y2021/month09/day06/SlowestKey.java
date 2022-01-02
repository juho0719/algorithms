package com.juho.leetCode.challenge.y2021.month09.day06;

public class SlowestKey {
    
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int longestPress = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        for (int i = 1; i < n; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i - 1];
            if (currentDuration > longestPress ||
                (currentDuration == longestPress && keysPressed.charAt(i) > slowestKey)) {
                longestPress = currentDuration;
                slowestKey = keysPressed.charAt(i);
            }
        }
        return slowestKey;
    }
}