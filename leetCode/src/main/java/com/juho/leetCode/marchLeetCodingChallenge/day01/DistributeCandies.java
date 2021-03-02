package com.juho.leetCode.marchLeetCodingChallenge.day01;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueCandiesSet = new HashSet<>();
        for (int candy: candyType) {
            uniqueCandiesSet.add(candy);
        }
        return Math.min(uniqueCandiesSet.size(), candyType.length / 2);
    }
}