package me.two_pointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _13MaxNumberKSumPairs {
    public int maxOperations(int[] nums, int k) {
        //sort array
        Arrays.sort(nums);

        int leftIndex = 0;
        int righIndex = nums.length -1;
        int maxOperations = 0;
        while (leftIndex < righIndex){
            int sumCurrentValues = nums[leftIndex] + nums[righIndex];
            if(sumCurrentValues == k){
                maxOperations++;
                leftIndex ++;
                righIndex --;
            } else if (sumCurrentValues > k){
                righIndex --;
            } else {
                leftIndex ++;
            }

        }

        return maxOperations;
    }
}
