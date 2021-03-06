package com.juho.leetCode.challenge.month01.day06;

public class KthMissingPositiveNumber {
    
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int arrIdx = 0;
        int i=0;
        while(count!=k) {
            if(arrIdx == arr.length) {
                return i+(k-count);
            }

            i++;

            if(arr[arrIdx] == i) {
                arrIdx++;
                continue;
            } else {
                count++;
            }
            if(count == k) {
                return i;
            }
        }
        return i;
    }

}