package com.juho.leetCode.challenge.y2021.month12.day26;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, 
 * return the k closest points to the origin (0, 0).
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 * 
 * Example 1:
 * Input: points = [[1,3],[-2,2]], k = 1
 * Output: [[-2,2]]
 * Explanation:
 * The distance between (1, 3) and the origin is sqrt(10).
 * The distance between (-2, 2) and the origin is sqrt(8).
 * Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
 * We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
 * 
 * Example 2:
 * Input: points = [[3,3],[5,-1],[-2,4]], k = 2
 * Output: [[3,3],[-2,4]]
 * Explanation: The answer [[-2,4],[3,3]] would also be accepted.
 * 
 * Constraints:
 * 1 <= k <= points.length <= 10^4
 * -10^4 < xi, yi < 10^4
 */
public class KClosestPointsToOrigin {
	public int[][] kClosest(int[][] points, int k) {
        double[] distances = new double[points.length];
        double low = 0, high = 0;
        List<Integer> remaining = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            distances[i] = euclideanDistance(points[i]);
            high = Math.max(high, distances[i]);
            remaining.add(i);
        }
        List<Integer> closest = new ArrayList<>();
        while (k > 0) {
            double mid = low + (high - low) / 2;
            List<List<Integer>> result = splitDistances(remaining, distances, mid);
            List<Integer> closer = result.get(0), farther = result.get(1);
            if (closer.size() > k) {
                remaining = closer;
                high = mid;
            } else {
                k -= closer.size();
                closest.addAll(closer);
                remaining = farther;
                low = mid;
            }
        }
        k = closest.size();
        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = points[closest.get(i)];
        }
        return answer;
    };
    
    private List<List<Integer>> splitDistances(List<Integer> remaining, double[] distances, double mid) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> closer = new ArrayList<>();
        List<Integer> farther = new ArrayList<>();
        result.add(closer);
        result.add(farther);
        for (int point : remaining) {
            if (distances[point] <= mid) {
                closer.add(point);
            } else {
                farther.add(point);
            }
        }
        return result;
    }
    
    private double euclideanDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}