package com.juho.leetCode.decemberLeetCodingChallenge.day25;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway {

    public boolean kLengthApart(int[] nums, int k) {
        int index = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                if(index > -1 && i-index-1<k) {
                    return false;
                }
                index = i;
            }
        }
        return true;
    }
}
