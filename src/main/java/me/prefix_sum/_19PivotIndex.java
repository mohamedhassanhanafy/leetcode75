package me.prefix_sum;

import java.util.Arrays;

public class _19PivotIndex {
    public int pivotIndex(int[] nums) {

        int[] leftSums = new int[nums.length];
        leftSums[0] = 0;
        int[] rightSums = new int[nums.length];
        rightSums[nums.length -1] = 0;
        for (int i = 1, j = nums.length -2; i < nums.length && j > -1; i++, j--) {
            leftSums[i] = leftSums[i-1] + nums[i-1];
            rightSums[j] = rightSums[j+1] + nums[j+1];
        }

        for (int i = 0; i <nums.length; i++) {
            if (leftSums[i] == rightSums[i]){
                return i;
            }
        }
        return -1;
    }
}
