package com.juho.leetCode.challenge.y2021.month02.day17;


public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right) {
            int curArea = 0;
            if(height[left] > height[right]) {
                curArea = height[right] * (right - left);
                right--;
            } else {
                curArea = height[left] * (right - left);
                left++;
            }
            
            if(curArea > maxArea) maxArea = curArea;
        }

        return maxArea;
    }
}
