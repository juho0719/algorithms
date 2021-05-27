package com.juho.leetCode.mayLeetCodingChallenge.day26;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0; i<n.length(); i++) {
            String partChar = n.substring(i, i+1);
            int decimal = Integer.parseInt(partChar);
            if( decimal > max) {
                max = decimal;
            }
        }
        return max;
    }
}
