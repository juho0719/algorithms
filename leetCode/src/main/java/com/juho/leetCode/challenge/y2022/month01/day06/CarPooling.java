package com.juho.leetCode.challenge.y2022.month01.day06;

/**
 * There is a car with capacity empty seats. 
 * The vehicle only drives east (i.e., it cannot turn around and drive west).
 * You are given the integer capacity and an array trips 
 * where trip[i] = [numPassengersi, fromi, toi] indicates 
 * that the ith trip has numPassengersi passengers 
 * and the locations to pick them up and drop them off are fromi and toi respectively. 
 * The locations are given as the number of kilometers due east from the car's initial location.
 * Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
 * 
 * Example 1:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 4
 * Output: false
 * 
 * Example 2:
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 5
 * Output: true
 * 
 * Constraints:
 * 1 <= trips.length <= 1000
 * trips[i].length == 3
 * 1 <= numPassengersi <= 100
 * 0 <= fromi < toi <= 1000
 * 1 <= capacity <= 10^5
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int lengthOfTrip[] = new int[1001];
        for (int trip[] : trips){
            lengthOfTrip[trip[1]] += trip[0];
            lengthOfTrip[trip[2]] -= trip[0];
        }
        int carLoad = 0;
        for (int i = 0; i < 1001; i++){
            carLoad += lengthOfTrip[i];
            if(carLoad > capacity) return false;
        }
        return true;
    }
}