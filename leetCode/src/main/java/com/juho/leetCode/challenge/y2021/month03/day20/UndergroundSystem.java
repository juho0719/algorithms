package com.juho.leetCode.challenge.y2021.month03.day20;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    Map<Integer, Pair<String, Integer>> checkins = new HashMap<>();
    Map<Pair<String, String>, int[]> routes = new HashMap<>();
    public void checkIn(int id, String stationName, int t) {
        checkins.put(id, new Pair<>(stationName, t));
    }
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> cIn = checkins.get(id);
        checkins.remove(id);
        Pair<String, String> route = new Pair<>(cIn.getKey(), stationName);
        int[] trip = routes.getOrDefault(route, new int[2]);
        trip[0]++;
        trip[1] += t - cIn.getValue();
        routes.put(route, trip);
    }
    public double getAverageTime(String startStation, String endStation) {
        int[] trip = routes.get(new Pair<>(startStation, endStation));
        return (double)trip[1] / trip[0];
    }

    class Pair<T, S> {
        T first;
        S second;

        public Pair(T first, S second) {
            this.first = first;
            this.second = second;
        }

        public T getKey() {
            return this.first;
        }

        public S getValue() {
            return this.second;
        }
    }
}