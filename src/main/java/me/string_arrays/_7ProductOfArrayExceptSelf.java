package me.string_arrays;

public class _7ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int[] leftSideProduct = new int[nums.length];
        int[] righSideProduct = new int[nums.length];

        leftSideProduct[0] = 1;
        righSideProduct[nums.length-1] = 1;


        for (int i = 1; i < nums.length; i++) {
            leftSideProduct[i] = leftSideProduct[i-1] * nums[i-1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            righSideProduct[i] = righSideProduct[i+1] * nums[i+1];
        }


        for (int i = 0; i < result.length; i++) {
            result[i] = leftSideProduct[i] * righSideProduct[i];
        }

        return result;
    }
}
