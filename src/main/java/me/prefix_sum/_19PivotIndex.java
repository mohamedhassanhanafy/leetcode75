package me.prefix_sum;

import java.util.Arrays;

public class _19PivotIndex {
    public int pivotIndex(int[] nums) {

        int[] leftSums = new int[nums.length];
        leftSums[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSums[i] = leftSums[i-1] + nums[i-1];
        }

        int[] rightSums = new int[nums.length];
        rightSums[nums.length -1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSums[i] = rightSums[i+1] + nums[i+1];
        }



        for (int i = 0; i <nums.length; i++) {
            if (leftSums[i] == rightSums[i]){
                return i;
            }
        }
        return -1;
    }
}
