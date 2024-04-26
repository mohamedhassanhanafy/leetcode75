package me.two_pointers;

public class _12ContainerWithMaxWater {

    public int maxArea(int[] height) {

        int leftIndex = 0;
        int rightIndex = height.length -1;
        int maxArea = 0;
        while (leftIndex < rightIndex){
            int currentArea = (rightIndex - leftIndex) * Math.min(height[rightIndex], height[leftIndex]);
            if (currentArea > maxArea){
                maxArea = currentArea;
            }

            if (height[rightIndex] > height[leftIndex]){
               leftIndex ++;
            } else {
                rightIndex --;
            }
        }

        return maxArea;
    }

}
