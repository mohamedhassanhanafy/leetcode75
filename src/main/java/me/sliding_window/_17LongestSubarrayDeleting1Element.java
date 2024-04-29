package me.sliding_window;

public class _17LongestSubarrayDeleting1Element {
    public int longestSubarray(int[] nums) {

        // The core idea is to keep track of last zero occurance
        // incase of currentItem is 1: add to current sum
        // incase of zero:
        //      1- if coming from one, update current sum to count number of ones between current zero and last zero
        //      2- if coming from zero, reset current sum to zero
        // lastly to check if we faced during the alogrithm any zero, to handle the case of all ones as we need to drop element then

        int maxSum = 0;
        boolean isZeroSkiped = false;
        int currentSum = 0;
        int lastZeroIndex = -1;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0 && !isZeroSkiped){
                isZeroSkiped = true;//fix case, if all are ones and need to delete 1
            }

            // in case of 1, increase the current sum
            if (nums[i] == 1){
                currentSum++;
            } else {
                boolean comingFromOne = i > 0 && nums[i-1] == 1;
                if(comingFromOne){
                    currentSum = lastZeroIndex > -1 ? i - lastZeroIndex - 1 : i;// number of ones between zero Indices
                }

                boolean comingFromZero = i > 0 && nums[i-1] == 0;
                if(comingFromZero){
                    currentSum = 0;// number of ones between zero Indices
                }

                lastZeroIndex = i; // keep track of last zero
            }

            // Final step is to update max sum if possible
            if(currentSum > maxSum){
                maxSum = currentSum;
            }

        }
        maxSum = !isZeroSkiped && maxSum > 0 ? maxSum -1 : maxSum;
        return maxSum;
    }
}
