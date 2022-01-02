package com.juho.leetCode.challenge.month09.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =0,j=0;
        List<Integer> res = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {res.add(nums1[i]);i++;j++;}
            else if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;}
        int result[] = new int[res.size()];
        for(int k=0;k< res.size();k++)
            result[k] = res.get(k);
        return result;
    }
}