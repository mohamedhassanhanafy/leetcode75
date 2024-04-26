package me.two_pointers;

public class _10MoveZeros {
    public void moveZeroes(int[] nums) {

        // count num of zero
        int numZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                numZero++;
            }
        }

        // override the non zero on same array with order
        int lastNonZeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[lastNonZeroIndex + 1] = nums[i];
                lastNonZeroIndex++;
            }
        }

        //append zeros to the end of numd
        for (int i = 0; i < numZero; i++) {
            nums[nums.length - i - 1] = 0;
        }

    }
}
