package com.juho.leetCode.challenge.y2022.month01.day29;

import java.util.Stack;

/**
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
 * return the area of the largest rectangle in the histogram.
 * 
 * Example 1:
 * Input: heights = [2,1,5,6,2,3]
 * Output: 10
 * Explanation: The above is a histogram where width of each bar is 1.
 * The largest rectangle is shown in the red area, which has an area = 10 units.
 * 
 * Example 2:
 * Input: heights = [2,4]
 * Output: 4
 * 
 * Constraints:
 * 1 <= heights.length <= 10^5
 * 0 <= heights[i] <= 10^4
 */

public class LargestRectangleInHistogram {
    class Pair{
        int x,y;
    }
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 0) return 0;
        if(heights.length == 1) return heights[0];
        Pair[] p = new Pair[heights.length];
        for(int i=0;i<p.length;i++)
            p[i] = new Pair();
        Stack<Integer> st = new Stack<>();
        // Find Nearest Smallest to Left
        for(int i=0;i<heights.length;i++){
            if(st.isEmpty()){
                p[i].x = -1;
            }
            else if(heights[st.peek()] < heights[i]){
                p[i].x = st.peek();
            }
            else{
                while(!st.isEmpty() && heights[st.peek()] >= heights[i])
                    st.pop();
                if(st.isEmpty())
                    p[i].x = -1;
                else p[i].x = st.peek();
            }
            st.add(i);
        }
        
        st.clear();
		
        for(int i=heights.length-1;i>=0;i--){
            if(st.isEmpty()) p[i].y = heights.length;
            else if(heights[i] > heights[st.peek()]) p[i].y = st.peek();
            else {
                while(!st.isEmpty() && heights[i] <= heights[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty())
                    p[i].y = heights.length;
                else p[i].y = st.peek();
            }
            st.add(i);
        }
        int ans = 0;
        for(int i=0;i<p.length;i++){
            ans = Math.max(ans, heights[i]*(p[i].y-p[i].x-1));
        }
        return ans;
    }
}