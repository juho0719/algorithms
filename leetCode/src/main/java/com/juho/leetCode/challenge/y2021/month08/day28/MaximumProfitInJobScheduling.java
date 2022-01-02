package com.juho.leetCode.challenge.y2021.month08.day28;

import java.util.Arrays;

public class MaximumProfitInJobScheduling {
    int[] startTime;
    int[] endTime;
    int len;
    int[] profit;
    int max;

    class Job {
        int pos;

        Job(int pos) {
            this.pos = pos;
        }

        int start() {
            return startTime[pos];
        }

        int end() {
            return endTime[pos];
        }

        int profit() {
            return profit[pos];
        }

        @Override
        public String toString() {
            return pos + " " + start() + " " + end();
        }

    }

    Job[] jobs;
    int[] memo;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.len = startTime.length;
        this.profit = profit;
        memo = new int[len];
        int end = 0;
        jobs = new Job[len];
        for (int i = 0; i < len; i++) {
            jobs[i]=new Job(i);
            if (endTime[i] > end)
                end = endTime[i];
        }
        Arrays.sort(jobs, (j1, j2) -> j1.start() - j2.start());

        return calcMaxProfit(0);
    }

    int calcMaxProfit(int startJob) {
        if (startJob >= len)
            return 0;
        int mem = memo[startJob];
        if (mem != 0) {
            return mem==-1?0:mem;
        }
        Job j = jobs[startJob];
        int jobEnd = j.end();
        int jobProfit = j.profit();
        // take job
        int nextJob = startJob + 1;
        while (nextJob < len && jobs[nextJob].start() < jobEnd)
            nextJob++;
        int profitTake = jobProfit + calcMaxProfit(nextJob);
        // not take job
        int profitNotTake = calcMaxProfit(startJob + 1);
        int result = Math.max(profitTake, profitNotTake);

        memo[startJob]=result==0?-1:result;
        return result;
    }
}