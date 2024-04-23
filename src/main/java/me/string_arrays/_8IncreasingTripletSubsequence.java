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
    // another simple solution
    //The algorithm relies on the fact that if there is an increasing triplet in the array, there must be two values, a and b, such that a < b.
    // The algorithm keeps track of the two smallest values encountered (a and b).
    // If it finds an element greater than both a and b, it means there is an increasing triplet.
    public boolean increasingTriplet_simple(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }


}
