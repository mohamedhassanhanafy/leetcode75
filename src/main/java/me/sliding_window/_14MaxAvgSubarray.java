package me.sliding_window;

public class _14MaxAvgSubarray {
    public double findMaxAverage(int[] nums, int k) {

        // max average range is same max average sum
        //get max sum of initial k
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum+= nums[i];
        }

        int currentSum = maxSum;
        // check all sums of range by subtracting prev index and add new index
        for (int i = 1; i < nums.length - k + 1 ; i++) {
            currentSum = currentSum - nums[i-1] + nums[i + k - 1];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }

        return  maxSum * 1.0 / k;
    }
}
