package com.wang;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while (i<j){
            int tempArea = Math.min(height[i], height[j])*(j-i);
            if (maxArea<tempArea){
                maxArea=tempArea;
            }
            if (height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }

}
