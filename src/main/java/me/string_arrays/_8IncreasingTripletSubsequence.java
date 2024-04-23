package me.string_arrays;

public class _8IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {

        if(nums.length < 3 ) {
            return false;
        }

        // create smaller array that stores the smallest number for each index
        int[] smaller = new int[nums.length];
        smaller[0] = -1;
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[minIndex]){
                minIndex = i;
                smaller[i] = -1;
            }else {
                smaller[i] = minIndex;
            }
        }


        // create greater array that stores the greatest number for each index
        int[] greater = new int[nums.length];
        greater[nums.length -1] = -1;
        int maxIndex = nums.length -1;
        for (int i = nums.length -1; i >= 0; i--) {
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
                greater[i] = -1;
            }else {
                greater[i] = maxIndex;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if(smaller[i] != -1 && greater[i] != -1 && nums[i] > nums[smaller[i]] && nums[i] < nums[greater[i]]){
                return true;
            }
        }


        return false;
    }


}
